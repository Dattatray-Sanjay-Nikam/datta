
import java.util.Scanner;

public class using_continue {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(true){
            if(n%10==0){
                continue;
            }
            System.err.println(n);

        }

        
    }
    
}
