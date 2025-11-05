import java.io.FileWriter;
import java.io.FileReader;
public class Files {
    public static void main(String[] args) {
        System.out.println("File write and read");
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in java");
            myWriter.close();
            System.out.println("Successfully wrote to file.");
          } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }


          try{
            FileReader myReader = new FileReader("filename.txt");
            int i;
            while ((i = myReader.read()) != -1) {
              System.out.print((char) i);
            }
            myReader.close();
          } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }
}
