public class linear_search {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(key==i){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40,50,60,70,80};
        int key =70;
        @SuppressWarnings("unused")
        int index = linearsearch(numbers, key);
    }
    
}
