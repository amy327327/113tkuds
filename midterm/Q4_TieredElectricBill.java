import java.util.Scanner;
public class Q4_TieredElectricBill {




    // 分段計算方法
    public static double calc(int kWh) {
        double sum = 0;

        int[] limits =    { 120, 210, 170, 200, 300, Integer.MAX_VALUE }; // 每段範圍大小
        double[] rates =  { 1.68, 2.45, 3.70, 5.04, 6.24, 8.46 };

        for (int i = 0; i < limits.length && kWh > 0; i++) {
            int use = Math.min(kWh, limits[i]);
            sum += use * rates[i];
            kWh -= use;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        double total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = Integer.parseInt(scanner.nextLine().trim());
            double bill = calc(kWh);
            System.out.printf("Bill: $%.0f\n", bill);
            total += bill;
        }

        System.out.printf("Total: $%.0f\n", total);
        System.out.printf("Average: $%d\n", Math.round(total / n));
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 每筆電量使用固定 6 段迴圈處理，單次處理為 O(1)
 * - 處理 n 筆資料，總時間為 O(n)
 */

    

