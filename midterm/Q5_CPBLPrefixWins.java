
    import java.util.Scanner;
public class Q5_CPBLPrefixWins {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取比賽場數
        int n = sc.nextInt();

        // 讀取每場比賽的勝敗結果（1 勝，0 敗）
        int[] results = new int[n];
        for (int i = 0; i < n; i++) {
            results[i] = sc.nextInt();
        }

        // 讀取要查詢的前 k 場
        int k = sc.nextInt();

        // 建立 prefix sum 陣列
        int[] prefixSum = new int[n + 1]; // prefixSum[0] = 0
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + results[i - 1];
        }

        // 輸出前 k 場的 prefix sum
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + prefixSum[i]);
        }
        System.out.println();
    }
}
/*
 * Time Complexity: O(n)
 * 說明：單一迴圈計算 prefix sum，總共 O(n)。
 */


    

