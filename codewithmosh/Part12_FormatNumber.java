package codewithmosh;

import java.text.NumberFormat;


/*
 * Abstract Classes
 * 
*/
public class Part12_FormatNumber {
    public static void main(String[] args) {
        // cant create an instance of an NumberFormat because it's an Abstract Class
        // NumberFormat current = new NumberFormat();

        // Factory Method
        NumberFormat percent = NumberFormat.getPercentInstance();
        String result = percent.format(0.191);
        System.out.println(result);

        // chaining methods
        String currency = NumberFormat.getCurrencyInstance().format(1_111_111.99);
        System.out.println(currency);

    }
}
 