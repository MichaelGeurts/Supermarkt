package nl.yacht.supermarkt;

public class Registry {



    public void t(double total, double givenMoney){
        if(hasCustomerPaidEnough(total, givenMoney)){
            System.out.println(returnChange(total, givenMoney));
        }
    }

    public boolean hasCustomerPaidEnough(double total, double givenMoney){
        return givenMoney >= total;

    }

    public double returnChange(double total, double givenMoney){
        return givenMoney - total;
    }



}
