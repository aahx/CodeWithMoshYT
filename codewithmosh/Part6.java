package codewithmosh;

import java.util.Arrays;

public class Part6 {
    public static void main(String[] args) {
        // int[] numbers = new int[5];
        // numbers[0] = 10;

        // arrays have a fixed length

        int[] numbers = { 2, 3, 5, 1, 4 };
        Arrays.sort(numbers);

        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));
    }
}
