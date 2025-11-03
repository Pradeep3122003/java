import java.util.Scanner;

public class Bank {
    static float balance=100;
    static String name = "user";
    static String pass = "abcd";
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Da Bank");
        
        line();
        System.out.println("----Enter your Credentials----");
        System.out.print("User: ");
        String name1 = scanner.nextLine();
        System.out.print("Password: ");
        String pass1 = scanner.nextLine();
        line();
        if (name1.equals(name) && pass1.equals(pass)) {
            System.out.println("Login successful. Welcome, " + name1 + "!");
            System.out.println("Your balance is: $" + balance);
        } else {
            System.out.println("Login failed. Invalid credentials.");
            scanner.close();
            return ;
        }
         
        line();
        int opt =0;
        while(opt!=4)
        {
            System.out.println("1.Check Balance 2. Add Amount 3. Withdraw 4. Logout");
            
            opt=scanner.nextInt();
            
                switch (opt) {
                    case 1: 
                        balance();
                        line();
                        break;
                    case 2:
                        add();
                        line();
                        break;
                    case 3:
                        withdraw();
                        line();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Invalid option");
                        break;
                
            }
             
        }
        System.out.println("Logout successful!");
       scanner.close();
 
    }
    static void line(){
       System.out.println("----------------------------------------");
    }

    static void balance(){
       System.out.println("Balance: "+balance);
    }

    static void add(){
        
        System.out.print("Enter amount to deposit: ");
        float a=scanner.nextFloat();
        balance+=a;
        System.out.println("Amount Credited: "+a);
        System.out.println("Total balance: "+balance);
        
    }

    static void withdraw(){
        
        System.out.print("Enter amount to withdraw: ");
        float a=scanner.nextFloat();
        balance-=a;
        if(balance>a){
            System.out.println("Amount Debited: "+a);
            System.out.println("Total balance: "+balance);
        }
        else{
             System.out.println("Insufficient Balance");
        }
        
    }
}
