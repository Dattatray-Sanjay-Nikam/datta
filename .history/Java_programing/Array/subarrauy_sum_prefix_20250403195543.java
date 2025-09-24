 class Subarrauy_Sum_Prefix {
    public static void prefix_sum(int numbers[]) {
        int maxSum =Integer.MIN_VALUE;
        int prefix[]= new int[numbers.length];
        //calculate the sum of prefix
         prefix[0]= numbers[0];
        for(int i =0 ; i<prefix.length;i++){
            prefix[i]= prefix[i-1]+numbers[i];
        }
        for(int i =0;i<numbers.length;i++){
            int start =i;
            for(int j =i;j<numbers.length;j++){
                int end =j;
                int currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
                if(maxSum < currSum){
                    maxSum=currSum;

                }
            }
        }
        System.err.println("maximum sum is"+maxSum);

        
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10}; 
        prefix_sum(numbers);
    }
    
}
