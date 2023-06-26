package codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Part19_MC2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Principal
        float principal = 0;
        while (true) {
            System.out.print("Prinicapl ($1K - $1M): ");
            principal = scanner.nextFloat();
            if (1000 <= principal && principal <= 1_000_000) {
                break;
            }
            System.out.print("Enter a number bewteen 1,000 and 1,000,000.");
        }

        // APR
        float apr = 0;
        while(true){
            System.out.print("Annual Interest Rate: ");
            apr = scanner.nextFloat();
            if(0 < apr && apr <= 30){
                break;
            }
            System.out.println("Enter a value greater than 0 and less than or equal to 30.");
        }

        // Years
        float mortgage = 0;
        while(true){
            System.out.print("Period (Years): ");
            mortgage = scanner.nextFloat();
            if( 0 < mortgage && mortgage <= 30){
                break;
            }
            System.out.println("Enter a value bewteen 1 and 30.");
        }


        // Mortage Calculator Method
        String mortgageFormatedCurrency = mortageCalculator(principal, apr, mortgage);

        // Output - Monthly Payments
        System.out.println("Mortgage: " + mortgageFormatedCurrency);

        scanner.close();
    }

    public static String mortageCalculator(float p, float apr, float years) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        float principal = p;
        float monthlyInterest = apr / PERCENT / MONTHS_IN_YEAR;
        int numberOfPayments = (int) years * MONTHS_IN_YEAR;

        // Mortgage calcualtor (monthly payments)
        double mortgage = principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
                /
                (Math.pow((1 + monthlyInterest), numberOfPayments) - 1));

        // Return formatted mortgage payment in currency
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        return mortgageFormatted;
    }
}
