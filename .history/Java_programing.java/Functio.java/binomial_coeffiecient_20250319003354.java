public class binomial_coeffiecient {
    public static int factorial(int n){
        int f =1;
        for(int i =1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static int binomial_coeff(int n,int r){
        int fac =factorial(n);
        int are= factorial(r);
        int nmr=factorial(n-r);
        int b_c=  fac/(are*nmr);
        return b_c;



    }
    public static void main(String[] args) {
        binomial_coeff(8,6 );
    }
}
