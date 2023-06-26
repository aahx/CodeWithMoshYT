// Reference Types

package codewithmosh;

import java.awt.Point;

/*
 * Reference types are copied by references
 * 
 * Primite are copied by their value
 * 
 * 
 */


public class Part3_ReferenceTypes {
    public static void main(String[] args){
        // memory
        byte x = 1;

        // y is at a different memory location
        // independent of each other
        byte y = x;

        x = 2;

        System.out.println(y);


        // allocate memory addr: 100
        // point1: addr: 100
        Point point1 = new Point(1,1);
        
        // reference holds the address not the object
        // reference holds the address not the object
        // reference holds the address not the object
        // reference holds the address not the object

        point1.x = 2;

        Point point2 = point1;
        
        point2.y = 10;


        // thats why we call them reference types
        // primitive types store the object in the memory
        // for reference we store the memory elsewhere and in that memory we hold the address, not the object itself


        System.out.println(point1);
        System.out.println(point2);
    }
    
}
