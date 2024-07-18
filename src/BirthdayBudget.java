import java.util.*;

public class BirthdayBudget {

    public static double countBrunchPrice(double brunch){
        double brunchTotal = brunch + brunch * 2;
        System.out.println("Brunch: $" + brunchTotal);
        return brunchTotal;
    }

    public static double countMoviesPrice(double ticket){
        double ticketTotal = ticket * 2;
        System.out.println("Movies: $" + ticketTotal);
        return ticketTotal;
    }


    public static double countCakePrice(double cake){
        double cakeTotal = cake + cake * ((double) 1 /3);
        System.out.println("Cake: $" + cakeTotal);
        return cakeTotal;
    }

    public static void countTotalBill(double tickets, double cakes, double brunch){
        double totalPrice = tickets+cakes+brunch;
        System.out.println("Grand Total: $" + totalPrice);
    }

    public static void main(String [] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("How much does brunch usually cost?");
        double brunchPrice = input.nextDouble();

        System.out.println("How much is a movie ticket for one person?");
        double ticketPrice = input.nextDouble();

        System.out.println("How much does a slice of triple-layered cake cost?");
        double cakePrice = input.nextDouble();

        System.out.println();
        System.out.println();

        double brunchTotal = countBrunchPrice(brunchPrice);
        double ticketTotal = countMoviesPrice(ticketPrice);
        double cakeTotal = countCakePrice(cakePrice);

        countTotalBill(ticketTotal, cakeTotal, brunchTotal);
    }
}
