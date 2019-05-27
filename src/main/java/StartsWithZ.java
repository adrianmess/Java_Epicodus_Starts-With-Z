import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartsWithZ {

    public static void main(String[] args) {
     System.out.println("What's your name?");
     try{
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         String userName = bufferedReader.readLine();
         if (userName.startsWith("Z")) {
             System.out.println("Your name starts with Z");
         } else {
             System.out.println("Your name doesn't start with Z :(");
         }
     }
     catch(IOException e) {
         e.printStackTrace();
     }
    }
}
