
import java.util.Scanner;

public class using_parameter {
    public static void sum(int num1,int num2){
        int add = num1+num2;
        System.err.println(add);
    }
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);

    }
    
}
