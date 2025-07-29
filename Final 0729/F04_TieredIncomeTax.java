
import java.util.Scanner;

public class F04_TieredIncomeTax {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 讀取筆數
        int[] incomes = new int[n];
        double[] taxes = new double[n];
        double totalTax = 0;

        // 讀入每筆收入
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }

        // 計算每筆稅額
        for (int i = 0; i < n; i++) {
            taxes[i] = calculateTax(incomes[i]);
            totalTax += taxes[i];
            System.out.printf("Tax: $%.0f\n", taxes[i]);
        }

        // 輸出平均稅額
        double averageTax = totalTax / n;
        System.out.printf("Average: $%.0f\n", averageTax);

        scanner.close();
    }

    public static double calculateTax(int income) {
        double tax = 0;

        if (income <= 560000) {
            tax = income * 0.05;
        } else if (income <= 1260000) {
            tax = income * 0.12 - 39200;
        } else if (income <= 2520000) {
            tax = income * 0.20 - 140000;
        } else if (income <= 4720000) {
            tax = income * 0.30 - 392000;
        } else {
            tax = income * 0.40 - 864000;
        }

        return tax;
    }
}

// 時間複雜度：O(n)
// 空間複雜度：O(n)

    

