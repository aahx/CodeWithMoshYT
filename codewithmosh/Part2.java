package codewithmosh;

import java.util.Date;

public class Part2 {
    public static void main(String[] args) {
        // // declaring - type of variable and name
        // // initiating/ instantiating 
        
        // byte age = 30;
        // long viewsCount = 3_100_500_000L;

        // float price = 10.99f;
        // double largePrice = 12.99d;
        // char letter = 'A';



        // System.out.println(age);
        // System.out.println(viewsCount);
        // System.out.println(price);
        // System.out.println(largePrice);
        // System.out.println(letter);


        /*
         * Types primitive types
         *          bytes   range
         * byte     1       [-128, 127]
         * short    2       [-32k, 32k]
         * int      4       [-2b, 2b]
         * long     8
         * 
         * float    4
         * double   8
         * 
         * char     2
         * boolean  1
         */


         /*
          * Reference types
          */

        // byte age = 30;
        // primitive types - do not need to allocate memory

        // but for reference
        Date now = new Date(); 
        // declaration - type and variable
        // creating an object by an instantiating a class / an instance of a class

        // primitive types do not have methods
        System.out.println(now);
        // sout - shortcut!
        System.out.println(now);


    }
}
