
import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        String result = (marks>=33)?"pass":"fail";
        System.err.println(result);
    }
}
