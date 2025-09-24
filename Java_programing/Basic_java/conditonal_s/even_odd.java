
import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.err.println("even");

        }
        else{
            System.err.println("odd");
        }
    }
}
