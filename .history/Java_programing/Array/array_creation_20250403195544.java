
import java.util.Arrays;

public class Array_Creation {
    @SuppressWarnings("unused")
    public static void main(String args[]){
        int arr[] =new int [50];
        int marks[] = {1,2,4};
        char vari[] ={'a','b','c'};//Java Automatically detect the size of aaray
        System.out.println("Marks: " + Arrays.toString(marks));
        System.out.println("Vari: " + Arrays.toString(vari));
    }
}
