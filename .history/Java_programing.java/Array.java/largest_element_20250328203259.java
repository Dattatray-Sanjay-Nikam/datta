public class largest_element {
    public static int largest_element(int numbers[]){
        int largest=Integer.MIN_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,5,7,4};
        System.err.println("largest element is = "+largest_element(numbers));
    }
    
}
