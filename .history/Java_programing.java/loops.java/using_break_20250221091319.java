
import java.util.Scanner;

public class using_break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            if(i/10==0){
                break;
            }
            System.err.println(i);
        }
        System.err.println("i am out from loop");
    }
    
}
