package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String name;
    public double price;
    public static List<Product> allProducts;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static List<Product> getListOfAvailableProducts(){
        return allProducts;
    }

    public static void initProductList(){
        allProducts = new ArrayList<Product>();
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        allProducts.add(this);
    }
}
