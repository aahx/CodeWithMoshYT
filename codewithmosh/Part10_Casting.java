// casting

package codewithmosh;

public class Part10_Casting{
    public static void main(String[] args){
        // Implicit casting
        // coverting to larger data type
        // byte > short > int > long > float > double
        // generally implicit casting happens when it gets more precise - no  loss of data
        // short x = 1;    // 2 bytes
        // int y = x + 2;  // 4 bytes
        

        // double x = 1.1;
        // // int y = x + 2;
        // double y = x + 2;


        // // Explicit Casting
        // // compatible types
        // double x = 1.1;
        // int y = (int)x + 2;


        // can't do this like this - incompatiable
        // String x = "1";
        // int y = (int)x + 2;
        
        // all primitive types- they have a Wrapper Class
        String x = "1.1";
        // Integer.parseInt(x); // int
        // Short.parseShort();
        // Float.parseFloat();
        double y = Double.parseDouble(x) + 2;
        
        System.out.println(y);
    }
}