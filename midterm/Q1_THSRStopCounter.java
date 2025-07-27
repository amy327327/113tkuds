
 import java.util.Scanner;

   

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());
        String[] stops = scanner.nextLine().trim().split(" ");
        String[] query = scanner.nextLine().trim().split(" ");
        String start = query[0];
        String end = query[1];

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIndex = i;
            }
            if (stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(endIndex - startIndex) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：
 * - 掃描站點陣列一次找出 start 與 end 的索引，時間為 O(n)
 * - n ≤ 12，固定範圍內為線性時間
 */

    

