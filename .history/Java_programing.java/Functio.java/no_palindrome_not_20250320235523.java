public class no_palindrome_not {
    public static void palindrome(int n){
        while(n>0){
             int lastdigit= n%10;
            System.err.println(lastdigit);
            n = n/10;

        }
    }
    public static void main(String[] args) {
        palindrome(121);
    }
    
}
