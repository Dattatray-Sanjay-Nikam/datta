public class pairs_in_array {
    public static void pairsarray(int numbers[]){
        int tp =0;

        for(int i=0 ;i<numbers.length;i++){
            int current= numbers[i];
        for(int j=i+1;j<numbers.length;j++){
            System.err.println("("+current+","+numbers[j]+")");
            tp++;
        }
        System.out.println();   
    }

    }
    public static void main(String[] args) {
        int numbers[]= {1,2,4,5,6,8};
        pairsarray(numbers);

    }

    
}
