public class trapped_rainwater {
    public static int trap_rainwater(int height[]){
        //calculate the leftmost boundry
        int n =height.length;
        int leftmost [] = new int[n];
         leftmost[0] = height[0];
         for(int i =1;i<=n;i++){
            leftmost[i]=Math.max(leftmost[i-1], height[i]);
         }
         int rightmost[]= new int [n];
         rightmost[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
            rightmost[i]=Math.max(rightmost[i+1], height[i]);
         }
        //calculate the rightmost boundry

        //calculate the waterlevel from above
        //calculate the trappedwater from given formula
    
    int trapped = 0;
    for(int i =0;i<=n;i++){
        int waterlevel = Math.min(leftmost[i],rightmost[i]);
        trapped =waterlevel-height[i];
    }
    return trapped;
}
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.err.println(trap_rainwater(height));
    }
    
}
