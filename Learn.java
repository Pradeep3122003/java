import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
public class Learn{
    static int a1=10;//global variable
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

            // chapter 15
            //methods
            song("bolo");
            
            // chapter 16
            //overloaded methods

            song(100);

            //variable scopes
            int a1=5; //Local variable
            System.out.println(a1);

            //  chapter 17
            //Arrays
            int[] arr = {1, 2, 3, 4, 5};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            String [] names = {"John", "Jane", "Bob"};
            for (String nam : names) {
                System.out.println(nam);
            }


            //Array operations
            int[] numbers = {1, 2, 3, 4, 5};
            int sum = 0;
            for (int n : numbers) {
                sum += n;
            }
            System.out.println("Sum: " + sum);

            int max = numbers[0];
            for (int n : numbers) {
                if (n > max) {
                    max = n;
                }
            }
            System.out.println("Max: " + max);

            int min = numbers[0];
            for (int n : numbers) {
                if (n < min) {
                    min = n;
                }
            }
            System.out.println("Min: " + min);

            int arraylen = numbers.length;
            System.out.println("Length: " + arraylen);

            Arrays.sort(numbers);
            System.out.println("Sorted array: " + Arrays.toString(numbers));

            //2d array
            int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
            for (int i = 0; i < matrix.length; i++) {
                for (int j1 = 0; j1 < matrix[i].length; j1++) {
                    System.out.print(matrix[i][j1] + " ");
                }
                System.out.println();
            }

            //3d array
            int[][][] cube = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
            for (int k1 = 0; k1 < cube.length; k1++) {
                for (int i1 = 0; i1 < cube[k1].length; i1++) {
                    for (int j1 = 0; j1 < cube[k1][i1].length; j1++) {
                        System.out.print(cube[k1][i1][j1] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

            // chapter 18
            //classes
            //constructor
            //inheritance
            //interface
            //enum
            gpa g = new gpa();
            g.input();
            g.calculate();
            
            //inheritance example
            //method overloading
            //method overriding
            //polymorphism
            //encapsulation
            //abstraction
            
            // chapter 19
            // ArrayList
            ArrayList<String> fruits = new ArrayList<>();
            fruits.add("apple");
            fruits.add("banana");
            fruits.add("cherry");
            fruits.add("date");
            System.out.println("Fruits: " + fruits);

            // chapter 20
            //HashSet
            HashSet<String> fruits1 = new HashSet<>();
            fruits1.add("apple");
            fruits1.add("banana");
            fruits1.add("cherry");
            fruits1.add("date");
            System.out.println("Fruits: " + fruits1);

            //chapter 21
            //exception handling
            //try catch
            //throw
            //finally
            //checked exception
            //unchecked exception
            //custom exception
            //multiple catch block

            try{
                int a2 = 10;
                int b1 = 0;
                int c1 = a2 / b1;
                System.out.println(c1);
            }
            catch(ArithmeticException e){
                System.out.println("Error: " + e.getMessage());
            }
            finally{
                System.out.println("Finally block executed.");
            }
        









    }
    //method
    static void song(String a){
        System.out.printf("%s jing jing jingat!",a);
    }
    static void song(int a){
        System.out.printf("%d baar jing jing jingat!",a);
    }
}
