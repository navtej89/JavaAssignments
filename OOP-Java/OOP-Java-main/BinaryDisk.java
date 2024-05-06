import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("binSample.dat");
            
            String myStr = "SGGSIET";
            byte[] bytes = myStr.getBytes();
            
            file.write(bytes);
            file.close();
            
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("Unable to open the file: " + e.getMessage());
        }
    }
}
