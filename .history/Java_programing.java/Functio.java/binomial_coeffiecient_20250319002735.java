public class binomial_coeffiecient {
    public static int factorial(int n){
        int f =1;
        for(int i =1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int binomial_coeffiecient(int n,int r){
        int fac =factorial(5);
        int are= factorial(4);
        int nmr=factorial(fac-are);
        int b_c=  fac/are*nmr;
        return b_c;



    }
    public static void main(String[] args) {
        int b=binomial_coeffiecient(5,6 );
    }
}
