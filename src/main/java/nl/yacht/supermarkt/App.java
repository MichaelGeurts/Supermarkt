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
        for(Product p : Supermarket.getLijstDomDing()){
            System.out.println(p.toString());
        }

        System.out.println("----------------------------");

        Supermarket.removeProductFromInventory(Supermarket.getLijstDomDing().get(2));

        for(Product p : Supermarket.getLijstDomDing()){
            System.out.println(p.toString());
        }

        System.out.println("----------------------------");

        Supermarket.removeProductFromInventory("Pampers", 8);

        for(Product p : Supermarket.getLijstDomDing()){
            System.out.println(p.toString());
        }

        System.out.println("----------------------------");
        System.out.println("Zet producten in karretje");

        cart.addMultipleProductsToCart(Supermarket.getProductByName("Pampers"), 10);

        for(CartProduct c : cart.getCartProductList()){
            System.out.println(c);
        }

        System.out.println("----------------------------");
        System.out.println("Haal ze er uit");

        cart.removeMultipleProductsFromCart(Supermarket.getProductByName("Pampers"), 5);

        for(CartProduct c : cart.getCartProductList()){
            System.out.println(c);
        }

        Registry r = new Registry();
        r.t(10.5, 15);


        System.out.println("----------------------------");
        r.calculateReturnThings(146.70);

    }

    private static void init() {
        calendar = Calendar.getInstance();
        cart = new Cart();
        supermarket = new Supermarket();
    }



}
