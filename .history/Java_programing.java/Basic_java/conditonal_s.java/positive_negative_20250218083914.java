
import java.util.Scanner;

public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.err.println("positive");
        }
        else{
            System.err.println("negative");
        }
    }
}
