import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter operation: ");
        char operation = scanner.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case '+':
                System.out.println("Result: " + num1 + num2);
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Result: %.2f" , (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                System.out.println("Result: " + (num1 % num2));
                break;
            case '^':
                System.out.println("Result: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }
        scanner.close();
    }
}
