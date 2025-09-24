public class no_primeor_not {
    public static boolean isPrime(int n){
        
        //corner case 
        if(n==2){
            return true;
        }
        for(int i=2; i<n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.err.println(isPrime(5));
    }
    
}
