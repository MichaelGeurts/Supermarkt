package nl.yacht.supermarkt;

import java.util.Calendar;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App
{
    private static int currentDay;
    private static Calendar calendar;
    private static Cart cart;
    
    public static void main( String[] args )
    {
        init();
        test();
    }

    private static void test() {
        for(Product p : Product.allProducts){
            System.out.println(p.name);
        }
    }

    private static void init() {
        calendar = Calendar.getInstance();
        cart = new Cart();
        initProducts();
    }

    private static void initProducts() {
        Product.initProductList();
        new Product("FrikandelBroodje", 1.00);
        new Product("Pampers", 9.99);
        new Product("KipFilet", 2.40);
        new Product("IjsThee", 0.99);
    }
}
