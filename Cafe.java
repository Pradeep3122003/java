import java.util.Scanner;
public class Cafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dishes={"Sandwich", "Pizza", "Burger", "Fries", "Soda"};
        double[] prices={2,3,4,1,2};
        System.out.println("Welcome to the Cafe!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Hello " + name + "! What would you like to order?\n ");

        for (int i = 0; i < dishes.length; i++) {
            System.out.println((i + 1) + ". " + dishes[i] + " - $" + prices[i]);
        }
        int order = scanner.nextInt();
        order--;

        System.out.print("How many " + dishes[order] + "(s) would you like? ");
        int quantity = scanner.nextInt();

        // assuming each item costs $2.50
        double totalCost = quantity * prices[order];

        System.out.printf("Thank you, %s! Your total for %d %s(s) is $%.2f.%n", name, quantity, dishes[order], totalCost);
        System.out.println("Please proceed to the counter to complete your order.");

        scanner.close();
    }
}
