
import java.util.Scanner;

public class using_input {
    
    public static void sum(){
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b = sc.nextInt();
       int  Sum =a+b;
       System.err.println(Sum);

    }
    public static void main(String[] args) {
        sum();
    }
}
