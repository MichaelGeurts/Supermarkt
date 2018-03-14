package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    private static List<Product> availableProducts;


    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public static  List<Product> getLijstDomDing(){
        return availableProducts;
    }

    public Supermarket() {
        init();
        initAllProducts();
    }

    private void init() {
        availableProducts = new ArrayList<Product>();
    }

    private void initAllProducts() {
        new Product("FrikandelBroodje", 1.00, 25);
        new Product("Pampers", 9.99, 20);
        new Product("KipFilet", 2.40, 15);
        new Product("IjsThee", 0.99, 35);
    }

    private static boolean hasProduct(Product p) {
        for (Product prod : availableProducts) {
            if (prod.equals(p)) {
                return true;
            }
        }
        return false;
    }

    public static Product getProductByName(String name) {
        for (Product p : availableProducts) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }


    public static boolean isProductInStock(String name) {
        return checkStock(getProductByName(name), 0);
    }

    public static boolean isProductInStock(Product p) {
        return hasProduct(p);
    }

    public static boolean isProductQuantityInStock(String name, int quantity) {
        return checkStock(getProductByName(name), quantity);
    }

    public static boolean isProductQuantityInStock(Product p, int quantity) {
        if (hasProduct(p)) {
            return checkStock(p, quantity);
        }
        return false;
    }

    private static boolean checkStock(Product p, int quantity) {
        if (!p.equals(null)) {
            return p.getNumberOfProducts() > quantity;
        }
        return false;
    }

    public static void addProductToInventory(Product p) {
        availableProducts.add(p);
    }

    public static void addNumberOfStockToExcistingProduct(Product p, int toAddedStock) {
        if (hasProduct(p)) {
            int index = 0;
            for (Product prod : availableProducts) {
                if (prod.equals(p)) {
                    prod.setNumberOfProducts(prod.getNumberOfProducts() + toAddedStock);
                }
                index++;
            }
        }
    }

    public static void removeProductFromInventory(Product p, int numberOfToRemoveProducts) {
        if ((hasProduct(p)) && isProductQuantityInStock(p, numberOfToRemoveProducts)) {
            int index = 0;
            for (Product prod : availableProducts) {
                if (prod.equals(p)) {
                    if (numberOfToRemoveProducts == 0) {
                        availableProducts.remove(index);
                    } else {
                        prod.setNumberOfProducts(prod.getNumberOfProducts() - numberOfToRemoveProducts);
                    }
                }
                index++;
            }
        }
    }

    public static void removeProductFromInventory(String productName, int numberOfToRemoveProducts) {
        removeProductFromInventory(getProductByName(productName), numberOfToRemoveProducts);
    }

    public static void removeProductFromInventory(Product p) {
        removeProductFromInventory(p, 0);
    }

    public static void removeProductFromInventory(String productName) {
        removeProductFromInventory(getProductByName(productName), 0);
    }
}
