package codewithmosh;

import java.util.Scanner;

public class Part17_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number: ");
        Byte input = scanner.nextByte();

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (input % 3 == 0) {
            System.out.println("Fizz");
        } else if (input % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(input);
        }

        scanner.close();
    }
}
