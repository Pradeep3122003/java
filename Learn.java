import java.util.Scanner;
public class Learn{
    public static void main(String[] args) {
        // chapter 1
        // Print Hello, World! to the console
        System.out.println("Hello, World!");
        /*  multiline comment */
        // chapter 2
        // Primitive Data Types
        int myNum = 5;               // Integer (whole number) 
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;
        String myText = "Hello";        // Boolean

        System.out.println("Integer: " + myNum+ 
                           "\nFloat: " + myFloatNum+ 
                           "\nCharacter: " + myLetter+ 
                           "\nBoolean: " + myBool + 
                           "\nString: " + myText);
      
         // chapter 3
            // Taking Input from the User
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
            //scanner.next() for single word input
            //scanner.nextInt() for integer input
            //scanner.nextDouble() for double input
            //scanner.nextLine() for string input and clear buffer
            //scanner.nextFloat() for float input
            //scanner.nextBoolean() for boolean input
            // Close the scanner
            scanner.close();
    }
}