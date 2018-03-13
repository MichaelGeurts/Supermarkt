package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartProduct> cartProductList;

    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public Cart() {
        cartProductList = new ArrayList<CartProduct>();
    }

    public void addMultipleProductsToCart(Product p, int numberOfProducts) {
        if (Supermarket.isProductQuantityInStock(p, numberOfProducts)) {
            if (isProductInCart(p)) {
                for (CartProduct cProd : cartProductList) {
                    if (cProd.getProduct().equals(p)) {
                        cProd.setNumberOfProducts(cProd.getNumberOfProducts() + numberOfProducts);
                        Supermarket.removeProductFromInventory(p, numberOfProducts);
                    }
                }
            } else {
                cartProductList.add(new CartProduct(p, numberOfProducts));
                Supermarket.removeProductFromInventory(p, numberOfProducts);
            }
        } else {
            System.out.println("Product is niet beschikbaar");
        }
    }

    private boolean isProductInCart(Product p) {
        for (CartProduct cProd : cartProductList) {
            if (cProd.getProduct().equals(p)) {
                return true;
            }
        }
        return false;
    }

    public void removeMultipleProductsFromCart(Product p, int numberToRemoveProducts) {
        if (isProductInCart(p)) {
            for (CartProduct cProd : cartProductList) {
                if (cProd.getProduct().equals(p)) {
                    if (cProd.getNumberOfProducts() > numberToRemoveProducts) {
                        cProd.setNumberOfProducts(numberToRemoveProducts);
                        Supermarket.addNumberOfStockToExcistingProduct(p,numberToRemoveProducts);
                    } else if (cProd.getNumberOfProducts() == numberToRemoveProducts) {
                        cartProductList.remove(cProd);
                        Supermarket.addNumberOfStockToExcistingProduct(p,numberToRemoveProducts);
                    } else {
                        System.out.println("Zoveel producten zitten niet in je winkelkarretje");
                    }
                }
            }
        } else {
            System.out.println("Grappenmaker dit product zit niet in het winkelkarretje");
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartProductList=" + cartProductList +
                '}';
    }
}
