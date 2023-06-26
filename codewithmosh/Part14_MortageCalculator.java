package codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Part14_MortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Principal
        System.out.print("Prinicapl: ");
        float principal = scanner.nextFloat();

        // APR
        System.out.print("Annual Interest Rate: ");
        float apr = scanner.nextFloat();

        // Years
        System.out.print("Period (Years): ");
        float mortage = scanner.nextFloat();

        // Mortage Calculator Method
        String mortgageFormatedCurrency = mortageCalculator(principal, apr, mortage);

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
