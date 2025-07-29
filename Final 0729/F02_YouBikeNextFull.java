
import java.util.Scanner;

public class F02_YouBikeNextFull {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        // 讀入 HH:mm 並轉成分鐘
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int hour = Integer.parseInt(parts[0]);
            int min = Integer.parseInt(parts[1]);
            times[i] = hour * 60 + min;
        }

        // 查詢時間轉分鐘
        String[] queryParts = sc.nextLine().split(":");
        int qHour = Integer.parseInt(queryParts[0]);
        int qMin = Integer.parseInt(queryParts[1]);
        int query = qHour * 60 + qMin;

        // 二分搜尋找到第一個大於 query 的時間
        int left = 0, right = n - 1;
        int answerIndex = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                answerIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (answerIndex == -1) {
            System.out.println("No bike");
        } else {
            int ansTime = times[answerIndex];
            int hour = ansTime / 60;
            int minute = ansTime % 60;
            System.out.printf("%02d:%02d\n", hour, minute);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找出第一個大於查詢時間的索引，時間複雜度為對數等級 O(log n)；
 * 時間轉換與讀取輸入各為 O(n)，但主體查找操作為 O(log n)，因此總體主要效率瓶頸為 O(log n)。
 */

    

