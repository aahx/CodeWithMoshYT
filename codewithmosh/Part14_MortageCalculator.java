package codewithmosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class Part14_MortageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Principal Value
        System.out.print("Prinicapl: ");
        float principal = Float.parseFloat(scanner.next());

        // APR
        System.out.print("Annual Interest Rate: ");
        float apr = Float.parseFloat(scanner.next());

        // Period Years
        System.out.print("Period (Years): ");
        float mortage = Float.parseFloat(scanner.next());

        // Mortage Calculations
        String monthlyPaymentsInCurrency = mortageCalculator(principal, apr, mortage);
        
        // Output - Monthly Payments
        System.out.println("Mortage: " + monthlyPaymentsInCurrency);

        scanner.close();
    }

    public static String mortageCalculator(float loan, float apr, float years) {
        // p is principal
        float p = loan;

        // r is monthly interest rate, calculated by dividing your apr by 12 (divided by
        // 100 to get percent)
        float r = (apr / 100) / 12;

        // n is number of payments in months
        int n = (int) years * 12;

        // Monthly payment formula
        double monthlyPayments = p * ((r * (Math.pow((1 + r), n)))
                /
                (Math.pow((1 + r), n) - 1));

        // Return in Currency
        String monthlyPaymentsInCurrency = NumberFormat.getCurrencyInstance().format(monthlyPayments);
        return monthlyPaymentsInCurrency;
    }
}
