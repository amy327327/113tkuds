import java.util.Arrays;
import java.util.Scanner;
public class F08_ClimbStairsMemo {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);  // 初始化為 -1 表示尚未計算

        int ways = climb(n, memo);
        System.out.println("Ways: " + ways);
    }

    // 遞迴搭配記憶化
    public static int climb(int n, int[] memo) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (memo[n] != -1) return memo[n];

        memo[n] = climb(n - 1, memo) + climb(n - 2, memo) + climb(n - 3, memo);
        return memo[n];
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每個 n 值最多只會被計算一次並記錄在 memo 陣列中，之後直接回傳。
 * 因此總共最多計算 n 次，時間複雜度為 O(n)。
 */

    

