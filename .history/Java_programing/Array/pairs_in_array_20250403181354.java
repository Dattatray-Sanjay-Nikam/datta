public class pairs_in_array {
    public static void pairsarray(int numbers[]) {
        int tp = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
                tp++;
            }
            System.out.println();  // Move to the next line after each element's pairs
        }

        System.out.println("\nTotal Pairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 4, 5, 6, 8};
        pairsarray(numbers);
    }
}
