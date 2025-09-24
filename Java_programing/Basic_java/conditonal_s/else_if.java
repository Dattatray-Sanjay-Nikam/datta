public class else_if {
    public static void main(String[] args) {
        int age =22;
        if(age>=18){
            System.err.println("adult");
        }
        else if(age>=13 && age<18){
            System.err.println("teenager");
        }
        else{
            System.err.println("child");
        }
    }
}
