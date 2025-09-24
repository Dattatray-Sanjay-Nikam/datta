public class linear_search {
    public static int linearsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
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
        if(index == -1){
            System.err.println("key is not found");

        }
        else{
            System.err.println("key is at index="+index);
        }
    }
    
}
