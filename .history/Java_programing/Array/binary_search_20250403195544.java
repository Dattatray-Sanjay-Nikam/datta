public class Binary_Search {

    public static int binarySearch(int numbers[], int key) {
        int start = 0;                      // Start of the array
        int end = numbers.length - 1;        // End of the array

        while (start <= end) {
            int mid = (start + end) / 2;     // Calculate the middle index

            // Check if the key is at the middle
            if (numbers[mid] == key) {
                return mid;                   // Return the index of the key
            }

            // If the key is larger, search the right half
            if (numbers[mid] < key) {
                start = mid + 1;
            } 
            // If the key is smaller, search the left half
            else {
                end = mid - 1;
            }
        }

        return -1;                            // Key not found
    }

    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50, 60, 70};   // Sorted array
        int key = 60;                                   // Key to search

        System.err.println("index of key is " + binarySearch(numbers, key));
    }
}
