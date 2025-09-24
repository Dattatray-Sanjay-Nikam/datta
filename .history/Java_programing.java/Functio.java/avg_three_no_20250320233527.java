
import java.util.Scanner;

public class avg_three_no {
    public static int avg(int a,int b,int c){
        int avg =(a+b+c/3);
        return avg;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
       // int a=23;
       // int b=53;
       // int c=64;
       Scanner sc = new Scanner(System.in);
       int a =sc.nextInt();
       int b =sc.nextInt();
       int c=sc.nextInt();
        System.err.println(avg(a, b, c));
    }
}
