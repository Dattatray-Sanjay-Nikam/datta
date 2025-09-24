 class Question_1_Array {
    public static int value_at_array(int numbers[]){
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i+1;j<numbers.length;j++){
                int end=j;
                if(start == end){
                    return 1;
                }
            }
        }
        return 2;
    }
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int numbers[]= {1,2,4,5,1};
    }

    
}
