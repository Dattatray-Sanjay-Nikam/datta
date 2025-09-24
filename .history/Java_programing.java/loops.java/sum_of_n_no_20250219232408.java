
import java.util.Scanner;

public class sum_of_n_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int sum = 0;
        int counter=1;
        while (counter <= t){
            System.err.println(counter);
            sum = sum+counter;
            counter++;

        }  
    }
}
