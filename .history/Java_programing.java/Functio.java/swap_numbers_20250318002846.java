public class swap_numbers {
    public static void swap(int a, int b){
        
        int temp = a;
         a = b;
         b= temp;
         


    }
    public static void main(String[] args) {
        int a =5;
        int b=7;
        swap(a, b);
        System.err.println("a=" +a);
        System.err.println("b=" +b);
    }
    
}
