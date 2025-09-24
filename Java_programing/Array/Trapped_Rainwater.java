class Trapped_Rainwater {
    public static int trap_rainwater(int height[]) {
        int n = height.length;
        if (n == 0) return 0; // Edge case: no bars, no trapped water

        // Calculate the leftmost boundary
        int leftmost[] = new int[n];
        leftmost[0] = height[0];
        for (int i = 1; i < n; i++) {  // Fixed condition
            leftmost[i] = Math.max(leftmost[i - 1], height[i]);
        }

        // Calculate the rightmost boundary
        int rightmost[] = new int[n];
        rightmost[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmost[i] = Math.max(rightmost[i + 1], height[i]);
        }

        // Calculate trapped water
        int trapped = 0;
        for (int i = 0; i < n; i++) {  // Fixed condition
            int waterlevel = Math.min(leftmost[i], rightmost[i]);
            trapped += waterlevel - height[i];  // Accumulate trapped water
        }
        return trapped;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("Trapped Rainwater: " + trap_rainwater(height));
    }
}
