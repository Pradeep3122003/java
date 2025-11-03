import java.util.Scanner;
public class Ceaser {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the text to be encrypted: ");
        String text = scanner.nextLine();
        System.out.println("Enter the shift value: ");
        int shift = scanner.nextInt();

        if(shift < 0 || shift == 25) {
            System.out.println("Shift value must be non-negative and non zero");
            return;
        }

        StringBuilder encryptedText = new StringBuilder();
        for (int i=0; i<text.length(); i++){
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                char encryptedChar = (char) ((ch - base + shift) % 26 + base);
                encryptedText.append(encryptedChar);
            } else {
                encryptedText.append(ch);
            }
        }
     
        System.out.println("Encrypted text: " + encryptedText.toString());
        scanner.close();
    }
}
