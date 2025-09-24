public class reverse_no {

    public static void main(String[] args) {
        int num = 10385;
        int reversed=0;
        while (num > 0) {
            int last_digit = num % 10; // Extract last digit
            reversed = reversed * 10 + last_digit;
            num = num / 10;
           System.err.println(last_digit);
        }
        System.err.println( "reverse is" +reversed);
    }
}
