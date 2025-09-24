import java.util.*;
public class gst_item {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pen = sc.nextFloat();
        float total = (pencil+pen+eraser*18)/100;
        System.err.println(total);
    }
}
