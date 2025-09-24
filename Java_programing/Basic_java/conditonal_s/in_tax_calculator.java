
import java.util.Scanner;

public class in_tax_calculator {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        @SuppressWarnings("unused")
        int tax;
        if(income < 5l){
            System.err.println("0%tax");
        }
        else if(income >= 5l && income <10l){
            tax = (int) (income*0.2);
            System.err.println("tax");
        }
        else{
            tax = (int) (income*0.3);
            System.err.println("tax");
        }

    }
    
}
