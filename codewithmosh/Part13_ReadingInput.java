package codewithmosh;

import java.util.Scanner;

public class Part13_ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        // String name = scanner.next();
        String input = scanner.nextLine();
        String formatted = input.trim(); 
        System.out.println("You are " + formatted);

        scanner.close();
    }
}
