
import java.util.Random;
import java.util.Scanner;

public class ds_06 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] numbers = new int[10]; // 建立陣列
        Random random = new Random();
        System.out.println("陣列內容：");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1; // 產生 1~100 的整數
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        


    
}}
