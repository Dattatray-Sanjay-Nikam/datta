public class print_prime_no_inrange {
    


    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i =2; i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
        

    }
    public static void inrangeprime(int n){
        for(int i =2;i<=n;i++){
            if(isPrime(i)){
                System.err.println(i+" ");
            }
        }

    }
    public static void main(String[] args) {
        inrangeprime(18);
        
    }
    
}

    

