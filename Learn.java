import java.util.Scanner;
import java.util.Random;
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

            // chapter 4
            // Conditional Statements
            int number = 10;
            if (number > 0) {
                System.out.println(number + " is a positive number.");
            } else if (number < 0) {
                System.out.println(number + " is a negative number.");
            } else {
                System.out.println("The number is zero.");
            }

            // chapter 5
            //airthmetic operations
            int a = 15;
            int b = 4;
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
            System.out.println("Multiplication: " + (a * b));
            System.out.println("Division: " + (a / b));
            System.out.println("Modulus: " + (a % b));

            //increment and decrement
            a++; // increment by 1
            b--; // decrement by 1

            // chapter 6
            //order of operations
            int result = (a + b) * (a - b);
            System.out.println("Result of (a + b) * (a - b): " + result);

            // chapter 7
            // Generating Random Numbers
            Random random = new Random();
            int randNum = random.nextInt(100); 
            float randFloat = random.nextFloat() * 100;
            System.out.println("Random Number: " + randNum);
            System.out.println("Random Float: " + randFloat);

    }
}