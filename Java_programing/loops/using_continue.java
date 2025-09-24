
import java.util.Scanner;

public class using_continue {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        do { 
            System.err.println("enter your choice");
            int n =sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.err.println(n);
            
        } while (true);
        
        
        
    }
    
}
