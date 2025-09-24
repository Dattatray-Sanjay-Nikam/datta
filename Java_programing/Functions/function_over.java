public class function_over {
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.err.println(sum(6, 6));
        System.err.println(sum(4, 5, 4));
    }
}
