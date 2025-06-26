import java.util.Scanner;

public class ds_05 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numbers = {3, 7, 1, 9, 4, 6, 8, 2, 5, 10};

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        } System.out.println("陣列所有元素的總和是：" + sum);
    }
    
}
