
import java.util.Scanner;

public class largest_three_num {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c){
            System.err.println("a is greater");
        }
        else if(b>c && b>a){
            System.err.println("b is greater");
        }
        else{
            System.err.println("c is greater");
        }
    }
}
