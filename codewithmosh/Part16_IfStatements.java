// boolean and ternary

package codewithmosh;

public class Part16_IfStatements {
    public static void main(String[] args) {
        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

        String className = (income > 100_000) ? "First" : "Economy";
        System.out.println(className);

    }
}
