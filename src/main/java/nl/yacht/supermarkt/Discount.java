package nl.yacht.supermarkt;

import java.util.Calendar;

public class Discount {
    private Calendar calendar;

    public void getCurrentDay() {
        calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);

        switch (day) {
            case Calendar.SUNDAY:
                System.out.println("Het is vandaag zondag");
                break;

            case Calendar.MONDAY:
                System.out.println("Het is vandaag maandag");
                break;

            case Calendar.TUESDAY:
                System.out.println("Het is vandaag disndag");
                break;

            case Calendar.WEDNESDAY:
                System.out.println("Het is vandaag woensdag");
                break;

            case Calendar.THURSDAY:
                System.out.println("Het is vandaag donderdag");
                break;

            case Calendar.FRIDAY:
                System.out.println("Het is vandaag vrijdag");
                break;

            case Calendar.SATURDAY:
                System.out.println("Het is vandaag zaterdag");
                break;
        }
    }
}
