public class max_sum_subaaryas {
    public static void subarraySum(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start =i;
            for (int j = i; j < numbers.length; j++) {
                int end =j;
                int currSum = 0;
                for (int k = start; k <= end; k++) {  // Include end index
                    currSum += numbers[k];
                }
                System.out.println("Sum of subarray [" + i + ", " + j + "] = " + currSum);
                maxSum = Math.max(maxSum, currSum);  // Update maxSum
            }
        }
        System.out.println("Maximum sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};  // Correct array initialization
        subarraySum(numbers);
    }
}
