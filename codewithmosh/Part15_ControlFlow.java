// Logical Operator

package codewithmosh;

public class Part15_ControlFlow {
    public static void main(String[] args) {
        // int temperature = 22;
        // boolean isWarm = 20 < temperature && temperature < 30;

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        
        
        System.out.println(isEligible);
    }
}
