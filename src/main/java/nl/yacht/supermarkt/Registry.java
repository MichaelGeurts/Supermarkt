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


    public void calculateReturnThings(double change){
        double tmp;

        if(change >= 100){
            tmp = (int) change/100;
            if(tmp > 1.0){
                System.out.println (tmp + "€100 bills");
            } else{
                System.out.println (tmp + "€100 bill");
            }
            change = change % 100;
        }

        if(change >= 50){
            tmp = (int) change/50;
            if(tmp > 1.0){
                System.out.println (tmp + "€50 bills");
            } else{
                System.out.println (tmp + "€50 bill");
            }
            change = change % 50;
        }

        if(change >= 20){
            tmp = (int) change/20;
            if(tmp > 1.0){
                System.out.println (tmp + "€20 bills");
            } else{
                System.out.println (tmp + "€20 bill");
            }
            change = change % 20;
        }

        if(change >= 10){
            tmp = (int) change/10;
            if(tmp > 1.0){
                System.out.println (tmp + "€10 bills");
            } else{
                System.out.println (tmp + "€10 bill");
            }
            change = change % 10;
        }

        if(change >= 5){
            tmp = (int) change/5;
            if(tmp > 1.0){
                System.out.println (tmp + "€5 bills");
            } else{
                System.out.println (tmp + "€5 bill");
            }
            change = change % 5;
        }

        if(change >= 2){
            tmp = (int) change/2;
            if(tmp > 1.0){
                System.out.println (tmp + "€2 coins");
            } else{
                System.out.println (tmp + "€2 coin");
            }
            change = change % 2;
        }

        if(change >= 1){
            tmp = (int) change/1;
            if(tmp > 1.0){
                System.out.println (tmp + "€1 coins");
            } else{
                System.out.println (tmp + "€1 coin");
            }
            change = change % 1;
        }

        if(change >= 0.5){
            tmp = (int) change/0.5;
            if(tmp > 1.0){
                System.out.println (tmp + "€0.50 coins");
            } else{
                System.out.println (tmp + "€0.50 coin");
            }
            change = change % 0.5;
        }

        if(change >= 0.2){
            tmp = (int) change/0.2;
            if(tmp > 1.0){
                System.out.println (tmp + "€0.20 coins");
            } else{
                System.out.println (tmp + "€0.20 coin");
            }
            change = change % 0.2;
        }


        if(change >= 0.1){
            tmp = (int) change/0.1;
            if(tmp > 1.0){
                System.out.println (tmp + "€0.10 coins");
            } else{
                System.out.println (tmp + "€0.10 coin");
            }
            change = change % 0.1;
        }

        if(change >= 0.05){
            tmp = (int) change/0.05;
            if(tmp > 1.0){
                System.out.println (tmp + "€0.05 coins");
            } else{
                System.out.println (tmp + "€0.05 coin");
            }
            change = change % 0.05;
        }
    }
}
