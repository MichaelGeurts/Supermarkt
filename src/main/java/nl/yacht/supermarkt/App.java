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
    private static Supermarket supermarket;

    public static void main( String[] args )
    {
        init();
        test();
    }

    private static void test() {
        for(Product p : Supermarket.availableProducts){
            System.out.println(p.toString());
        }

        System.out.println("----------------------------");

        Supermarket.removeProductFromInventory(Supermarket.availableProducts.get(2));

        for(Product p : Supermarket.availableProducts){
            System.out.println(p.toString());
        }

        System.out.println("----------------------------");
    }

    private static void init() {
        calendar = Calendar.getInstance();
        cart = new Cart();
        supermarket = new Supermarket();
    }

}
