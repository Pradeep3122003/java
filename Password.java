import java.util.Random;
public class Password {
    public static void main(String[] args) {
        // Define the characters to choose from
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "!@#$%^&*()-_=+[]{}|;:',.<>?/`~";
        String allChars = upperCase + lowerCase + digits + specialChars;

        // Set the desired password length
        int passwordLength = 12;

        // Create a Random object
        Random random = new Random();

        // Generate the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < passwordLength; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }

        // Print the generated password
        System.out.println("Generated Password: " + password.toString());
    }
}
