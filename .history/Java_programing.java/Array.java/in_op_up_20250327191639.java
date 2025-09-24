import java.util.Scanner;

public class in_op_up {
    public static void main(String args[]){
        int marks[] = new int[100];
        System.err.println("length of array is "+marks.length);
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
         marks[0]=sc.nextInt();//phy
         marks[1]=sc.nextInt();//chem
         marks[2]=sc.nextInt();//math
System.err.println("marks of physics is "+marks[0]);
System.err.println("marks of chemistry is "+marks[1]);
System.err.println("marks of math is"+marks[2]);
 //updation
marks[2]=100;
System.err.println("marks of math is"+marks[2]);
    }
    
}
