import java.util.Scanner;
public class Cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dishes="Coffee, Tea, Sandwich, Cake, pizza";
        String prices="2.50, 2.00, 5.00, 3.00, 8.00";
        System.out.println("Welcome to the Cafe!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Hello " + name + "! What would you like to order?\n "+dishes+"\n");
        String order = scanner.nextLine();
        order=order.trim();
        

        System.out.print("How many " + order + "(s) would you like? ");
        int quantity = scanner.nextInt();

        double pricePerItem = 2.50; // assuming each item costs $2.50
        double totalCost = quantity * pricePerItem;

        System.out.printf("Thank you, %s! Your total for %d %s(s) is $%.2f.%n", name, quantity, order, totalCost);
        System.out.println("Please proceed to the counter to complete your order.");

        scanner.close();
    }
}
