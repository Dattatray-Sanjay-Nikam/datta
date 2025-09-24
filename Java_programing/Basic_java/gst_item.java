import java.util.*;
public class gst_item {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float condom= sc.nextFloat();
        float key= sc.nextFloat();
        float pen = sc.nextFloat();
        float total = (pencil+pen+pen+eraser+condom+key);
        System.err.println(total);
        float newtotal = total+(0.18f * total);
        System.err.println(newtotal);
    }
}
