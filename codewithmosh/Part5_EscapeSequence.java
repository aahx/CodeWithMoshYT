// String Escape Sequences

package codewithmosh;

public class Part5_EscapeSequence {
    public static void main(String[] args) {
        // "\to exit"
        String message = "Hello \"Michael\"";
        System.out.println(message);
        System.out.println("\n");
        
        // c:\Windows\..s
        String file = "c:\\Windows\\..";
        System.out.println(file);
        
        String fileN = "c:\n\\Windows\\..";
        System.out.println("\n");
        System.out.println(fileN);

        String fileT = "c:\t\\Windows\\..";
        System.out.println("\n");
        System.out.println(fileT);
    }
}
