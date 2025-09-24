
import java.util.Scanner;

public class using_break {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
       do { 
           System.err.println("Enter your number");
           int n = sc.nextInt();
           if(n%10==0){
            break;
           }
           System.err.println(n);
       } while (true);
    }
    
}
