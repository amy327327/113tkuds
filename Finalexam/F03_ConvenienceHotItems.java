
import java.util.Scanner;
public class F03_ConvenienceHotItems {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        int[] qtys = new int[n];

        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            names[i] = line[0];
            qtys[i] = Integer.parseInt(line[1]);
        }

        // 插入排序（由高到低排序）
        for (int i = 1; i < n; i++) {
            String tempName = names[i];
            int tempQty = qtys[i];
            int j = i - 1;
            while (j >= 0 && qtys[j] < tempQty) {
                names[j + 1] = names[j];
                qtys[j + 1] = qtys[j];
                j--;
            }
            names[j + 1] = tempName;
            qtys[j + 1] = tempQty;
        }

        // 輸出前10名（若不足就全列）
        int limit = Math.min(n, 10);
        for (int i = 0; i < limit; i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序對 n 筆商品依銷量由大至小排序，最壞情況下每個元素都需與前面所有元素比較，故為 O(n^2)。
 */

    

