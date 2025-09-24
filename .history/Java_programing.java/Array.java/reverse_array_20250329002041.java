public class reverse_array {
    public static void reverse(int numbers[]){
        int first =0; int last = numbers.length-1;
        while(first<last){
            int temp=  numbers[last];
            numbers[last] =numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int numbers[] ={1,5,6,3,4};
        reverse(numbers);
    }
    
}
