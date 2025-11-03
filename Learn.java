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

            // chapter 8
            //math functions
            int num = -10;
            System.out.println("Absolute value of " + num + " is: " + Math.abs(num));
            System.out.println("Square root of 16 is: " + Math.sqrt(16));
            System.out.println("2 raised to the power 3 is: " + Math.pow(2, 3));
            System.out.println("Maximum of 10 and 20 is: " + Math.max(10, 20));
            System.out.println("Minimum of 10 and 20 is: " + Math.min(10, 20));
            System.out.println("Value of Pi: " + Math.PI);
            System.out.println("Value of e: " + Math.E);
            System.out.println("Ceiling of 4.3: " + Math.ceil(4.3));
            System.out.println("Floor of 4.7: " + Math.floor(4.7));
            System.out.println("Round of 4.5: " + Math.round(4.5));

            // chapter 9
            //printf formatting
            double price = 29.99;
            int quantity = 5;
            System.out.printf("Price: $%.2f, Quantity: %d, Total: $%.2f", price, quantity, price * quantity);
            // %d for integers
            // %f for floating point numbers
            // %.2f for floating point numbers with 2 decimal places
            // %s for strings
            // %c for characters
            // %b for boolean values
            //%+.2f for showing positive sign with 2 decimal places
            //%,d for comma separator in integers
            // %e for scientific notation
            //%(d for negative numbers in parentheses
            //%06d for padding with leading zeros

            // chapter 10
            // String operations
            String sample = "  Hello, Java Programming!";
            System.out.println("string length: " + sample.length());
            System.out.println("Uppercase: " + sample.toUpperCase());
            System.out.println("Lowercase: " + sample.toLowerCase());
            System.out.println("Trimmed: " + sample.trim());
            System.out.println("Substring (7, 11): " + sample.substring(7, 11));
            System.out.println("Replace 'Java' with 'World': " + sample.replace("Java", "World"));
            System.out.println("Character at index 1: " + sample.charAt(1));
            System.out.println("Index of 'Java': " + sample.indexOf("Java"));
            System.out.println("Contains 'Programming': " + sample.contains("Programming"));
            System.out.println("Starts with '  He': " + sample.startsWith("  He"));
            System.out.println("Ends with 'ming!': " + sample.endsWith("ming!"));
            System.out.println("last index of 'a': " + sample.lastIndexOf('a'));
            System.out.println("Concatenation: " + sample.concat(" Let's learn more."));
            System.out.println("is empty: " + sample.isEmpty());
            System.out.println("equals '  Hello, Java Programming!': " + sample.equals("  Hello, Java Programming!"));
            System.out.println("equalsIgnoreCase '  hello, java programming!': " + sample.equalsIgnoreCase("  hello, java programming!"));

            // chapter 11
            //ternary operator
            int age = 20;
            String eligibility = (age >= 18) ? "Eligible to vote." : "Not eligible to vote.";
            System.out.println("Age: " + age + " - " + eligibility);

            // chapter 12
            //case switch
            int day = 3;
            String dayName;
            switch (day) {
                case 1:
                    dayName = "Monday";
                    break;
                case 2:
                    dayName = "Tuesday";
                    break;
                case 3:
                    dayName = "Wednesday";
                    break;
                case 4:
                    dayName = "Thursday";
                    break;
                case 5:
                    dayName = "Friday";
                    break;
                case 6:
                    dayName = "Saturday";
                    break;
                case 7:
                    dayName = "Sunday";
                    break;
                default:
                    dayName = "Invalid day";
            }
            System.out.println("Day " + day + " is " + dayName);

            // chapter 13
            //Loops
            System.out.println("For Loop:");
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteration " + i);
            }

            System.out.println("While Loop:");
            int j = 1;
            while (j <= 5) {
                System.out.println("Iteration " + j);
                j++;
            }

            System.out.println("Do-While Loop:");
            int k = 1;
            do {
                System.out.println("Iteration " + k);
                k++;
            } while (k <= 5);

            // chapter 14
            //Logical Operators
            boolean x = true;
            boolean y = false;
            System.out.println("x AND y: " + (x && y));
            System.out.println("x OR y: " + (x || y));
            System.out.println("NOT x: " + (!x));
            







    }
}