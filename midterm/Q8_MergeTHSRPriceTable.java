
   import java.util.Scanner;
public class Q8_MergeTHSRPriceTable {
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取資料筆數
        int n = sc.nextInt();
        String[] station = new String[n];
        int[][] price = new int[n][2];

        // 讀取每筆資料
        for (int i = 0; i < n; i++) {
            station[i] = sc.next();
            price[i][0] = sc.nextInt(); // 標準票價
            price[i][1] = sc.nextInt(); // 商務票價
        }

        // 輸出表頭
        System.out.printf("%-10s|%-8s|%-8s\n", "Station", "Standard", "Business");

        // 輸出每筆資料
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10s|%-8d|%-8d\n", station[i], price[i][0], price[i][1]);
        }
    }
}

    

