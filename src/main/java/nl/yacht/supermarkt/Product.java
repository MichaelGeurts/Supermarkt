package nl.yacht.supermarkt;

import java.util.ArrayList;
import java.util.List;

public class Product {
    public String name;
    public double price;
    public int numberOfProducts;

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

    public int getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(int numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public Product(String name, double price, int numberOfProducts) {
        this.name = name;
        this.price = price;
        this.numberOfProducts = numberOfProducts;
        Supermarket.addProductToInventory(this);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", numberOfProducts=" + numberOfProducts +
                '}';
    }
}
