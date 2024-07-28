public class App {
    public static void main(String[] args) {
        int x; // Declaration
        x = 123; // Assignment

        int y = 666; // Initialization

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + x);
        System.out.println("My Other Number Is: " + y);

        // Initializing Long
        long z = 123456789111111111L;

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + z);

        // Initializing Byte
        byte c = 100;

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + c);

        // Initializing Float
        float b = 3.14f;

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + b);

        // Initializing Double
        double v = 3.14;

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + v);

        // Initializing Boolean
        boolean r = true;

        // Print out the value stored within the variables
        System.out.println("My Number Is: " + r);

        // Initializing Char
        char symbol = '@';

        // Print out the value stored within the variables
        System.out.println("My Symbol Is: " + symbol);

        // Initializing String
        String name = "Gurbaaz Cheema";

        // Print out the value stored within the variables
        System.out.println("Hello " + name);

        // ***************We will now learn to switch two variables or swap them***************
        System.out.println("\n***************We will now learn to switch two variables or swap them***************\n");

        String t = "water";
        String e = "Kool-Aid";
        String temp = null;

        temp = t;
        t = e;
        e = temp;

        System.out.println("x: " +  t);
        System.out.println("y: " + e);
    }
}
