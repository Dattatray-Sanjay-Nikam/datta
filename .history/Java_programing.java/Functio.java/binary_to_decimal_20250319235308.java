public class binary_to_decimal {
    public static void binTodec(int n){
        int dec=0;
        int pow =0;
        while(n>0){
            int lastdigit=n%10;
            dec= dec+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            n= n/10;
        }
    }
    public static void main(String[] args) {
        binTodec(101);
    }
    
}
