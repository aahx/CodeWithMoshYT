// Strings

package codewithmosh;


public class Part4_Strings {
    public static void main(String[] args){
        // this package is automatically imported
        // declaration of type and var name
        // instantiate and object/ creation

        // String message = new String("Hello World");
        // short hand -
        // is a reference type but since we use them often
        
        String message = "   Hello World";
        message += " !!   ";
        
        boolean endsWithExclaimation = message.endsWith("!!");
        System.out.println(endsWithExclaimation);

        System.out.println("message.length " + message.length());
        System.out.println("message.indexOf " + message.indexOf("Hello"));

        // In Java strings are immutable - any method that modifies a string returns a new string object
        
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        
    
        String modifiedMessage = message.replace("!!", "*");
        System.out.println(modifiedMessage);

        System.out.println(message.toLowerCase());
        System.out.println(message);

        System.out.println(message.trim());
        System.out.println(message);
    }
}
