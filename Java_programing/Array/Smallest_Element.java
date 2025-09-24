class Smallest_Element {
    public static int smallest_element(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int numbers[]= {4,5,3,6,2,1};
        System.err.println("smallest element is ="+smallest_element(numbers));
        }
    
}
