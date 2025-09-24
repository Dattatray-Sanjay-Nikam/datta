
import java.util.Scanner;

public class no_1to10 {
    public static void main(String[] args) {
        @SuppressWarnings({ "resource", "unused" })
        Scanner sc = new Scanner(System.in);
        
        int counter = 1;
        while(counter<=10){
            System.err.println(counter);
            counter++;
        }
    }
    
}
