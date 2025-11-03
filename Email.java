import java.util.Scanner;
public class Email {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        email = email.trim();
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("Invalid email address.");
            scanner.close();
            return;
        }
        String domain = email.substring(0, email.indexOf('@'));
        String provider = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));
        String tld = email.substring(email.lastIndexOf('.') + 1);
        System.out.println("Domain: " + domain);
        System.out.println("Provider: " + provider);
        System.out.println("Top-Level Domain: " + tld);
        scanner.close();
    }
}
