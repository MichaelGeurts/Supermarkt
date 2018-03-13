package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartProduct> cartProductList;

    public List<CartProduct> getCartProductList() {
        return cartProductList;
    }

    public void Cart() {
        cartProductList = new ArrayList<CartProduct>();
    }

    public void addMultipleProductsToCart(Product p, int numberOfProducts) {
        boolean isInCart = false;

        if (Supermarket.isProductInStock(p,numberOfProducts)) {
            for (CartProduct cProd : cartProductList) {
                if (cProd.getProduct().equals(p)) {
                    cProd.setNumberOfProducts(cProd.getNumberOfProducts() + numberOfProducts);
                    isInCart = true;
                }
            }
            if (!isInCart) {
                cartProductList.add(new CartProduct(p, numberOfProducts));
            }
        }else{
            System.out.println("Product is niet beschikbaar");
        }
    }

    public void removeMultipleProductsFromCart(Product p, int numberToRemoveProducts) {
        boolean isInCart = false;
        for (CartProduct cProd : cartProductList) {
            if (cProd.getProduct().equals(p)) {
                isInCart = true;
                if (cProd.getNumberOfProducts() > numberToRemoveProducts) {
                    cProd.setNumberOfProducts(numberToRemoveProducts);
                } else if (cProd.getNumberOfProducts() == numberToRemoveProducts) {
                    cartProductList.remove(cProd);
                } else {
                    System.out.println("Zoveel producten zitten niet in je winkelkarretje");
                }
            }
        }
        if (!isInCart) {
            System.out.println("Grappenmaker dit product zit niet in het winkelkarretje");
        }
    }
}
