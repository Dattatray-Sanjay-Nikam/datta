public class reverse_no {

    public static void main(String[] args) {
        int num = 10385;
        while (num > 0) {
            int last_digit = num % 10; // Extract last digit
            System.out.println(last_digit); // Print the digit
            num = num / 10; // Update the original num
        }
    }
}
