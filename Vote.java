import java.util.Scanner;
public class Vote {
    public static void main(String[] args) {
        String name;
        int age;
        boolean canVote=false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        if(age>=18){
            canVote = true;
        }
        if(canVote){
            System.out.print("Hello " + name + ", you are eligible to vote.");
        } else {
            System.out.print("Hello " + name + ", you are not eligible to vote.");
        }
        scanner.close();
    }
}
