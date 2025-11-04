public class gpa {
    String[] subject = new String [10];
    int[] marks = new int [10];
    int[] credits = new int [10];
    double gpa = 0.0;
  
    void input(){
        System.out.println("Enter total number of subjects: ");
        
        int n = 10;
        System.out.println("Enter subject, marks and credits n this manner:  subject marks credits\n");
        for(int i=0;i<n;i++){
            // subject[i] = sc.next();
            // marks[i] = sc.nextInt();
            // credits[i] = sc.nextInt();
            System.out.println("hi");
        }
      
    }

    void calculate(){
        for(int i=0;i<subject.length;i++){
            gpa = gpa + (marks[i]*credits[i]);
        }
        gpa = gpa/100.0;
    }
}
