package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Supermarket {
    public static List<Product> availableProducts;

    public List<Product> getAvailableProducts() {
        return availableProducts;
    }

    public Supermarket (){
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

    public static void addProductToInventory(Product p){
        availableProducts.add(p);
    }

    public static void removeProductFromInventory(Product p, int numberOfToRemoveProducts){
        for(Product prod : availableProducts){
            if (prod.equals(p)) {
                int numberOfAvailableProducts = prod.numberOfProducts;
                if(numberOfAvailableProducts >= numberOfToRemoveProducts){
                    prod.setNumberOfProducts(numberOfToRemoveProducts);
                }else{
                    //doe iets wat aangeeft dat dit niet mag
                }
            }
        }
    }

    public static void removeProductFromInventory(String productName, int numberOfToRemoveProducts){
        for(Product prod : availableProducts){
            if (prod.name.equals(productName)) {
                int numberOfAvailableProducts = prod.numberOfProducts;
                if(numberOfAvailableProducts >= numberOfToRemoveProducts){
                    prod.setNumberOfProducts(numberOfToRemoveProducts);
                }else{
                    //doe iets wat aangeeft dat dit niet mag
                }
            }
        }
    }

    public static void removeProductFromInventory(Product p){
        int index = 0;
        for (Product prod : availableProducts) {
            if (prod.equals(p)) {
                availableProducts.remove(index);
            }
            index++;
        }
    }

    public static void removeProductFromInventory(String productName){
        int index = 0;
        for (Product prod : availableProducts) {
            if (prod.name.equals(productName)) {
                availableProducts.remove(index);
            }
            index++;
        }
    }
}
