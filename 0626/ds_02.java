
import java.util.Scanner;
public class ds_02 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("輸入半徑:");
        double radius=s.nextDouble();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("半徑為 %.2f 的圓面積為 %.2f%n", radius, area);



    
}
}
