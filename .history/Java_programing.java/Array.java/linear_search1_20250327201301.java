public class linear_search1 {
    public static int linear_srh(String menu[], String key){
        for(int i =0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        String menu[] ={ "samosa","wada","pav","idli","sambar"};
        String key ="sambar";
        int index = linear_srh(menu, key);
        if(index == -1){
            System.err.println("key is not found");
        }
        else{
            System.err.println("key is found="+index);
        }
    }
    
}
