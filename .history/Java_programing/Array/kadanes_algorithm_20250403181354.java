public class kadanes_algorithm {
    public static void kadane(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum = currSum+numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum= Math.max(currSum, maxSum);
        }
        System.err.println("maximum sum of subaaryas is"+maxSum);
    }
    public static void main(String [] args){
        int numbers[] = {-1,-2,-4,4,2,1,5};
        kadane(numbers);
    }
}
