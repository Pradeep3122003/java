import java.util.ArrayList;
public class gpa {
    ArrayList<String> subject = new ArrayList<String>();
    ArrayList<Double> marks = new ArrayList<Double>();
    ArrayList<Integer> credits = new ArrayList<Integer>();
    
    double gpa = 0.0;
  
    void input(String sub, Double mark, int credit){
        subject.add(sub);
        marks.add(mark);
        credits.add(credit);
      
    }

    void calculate(){
        for(int i=0;i<subject.size();i++){
            gpa += marks.get(i)*credits.get(i);
        }
        gpa = gpa/100.0;
        double tot=0;
        for(double mark:marks){
            tot+=mark;
        }
        System.out.println("Total marks: "+tot);
        System.out.println("GPA: "+gpa);
    }
}
