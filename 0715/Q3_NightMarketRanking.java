
    import java.util.Scanner;
public class Q3_NightMarketRanking {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(scanner.nextLine().trim());
        }

        // 選擇排序（由大到小）
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIndex]) {
                    maxIndex = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIndex];
            scores[maxIndex] = temp;
        }

        // 輸出前 5 筆
        for (int i = 0; i < Math.min(5, n); i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：
 * - 外層跑 n-1 次，內層最多跑 n-1 次，總比較次數為 n(n-1)/2
 * - 屬於穩定但效率較低的排序，適合小範圍資料（此題 n <= 1000 可接受）
 */


    

