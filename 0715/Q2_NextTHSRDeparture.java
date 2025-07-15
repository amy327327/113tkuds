 import java.util.Scanner;
public class Q2_NextTHSRDeparture {
   


    // 將 HH:mm 格式轉成分鐘數
    public static int timeToMinutes(String time) {
        String[] parts = time.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        int[] minutes = new int[n];           // 儲存分鐘數
        String[] timesStr = new String[n];    // 保留原始 HH:mm 字串

        for (int i = 0; i < n; i++) {
            String time = scanner.nextLine().trim();
            timesStr[i] = time;
            minutes[i] = timeToMinutes(time);
        }

        String query = scanner.nextLine().trim();
        int queryMin = timeToMinutes(query);

        // Binary search for first element > queryMin
        int left = 0, right = n - 1;
        int idx = n; // 預設為 n（找不到就是 No train）

        while (left <= right) {
            int mid = (left + right) / 2;
            if (minutes[mid] > queryMin) {
                idx = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(timesStr[idx]);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：
 * - 使用 binary search 在已排序的 int 陣列中找第一個 > queryMin 的索引
 * - 時間複雜度為 O(log n)，比線性掃描更有效率
 */

    

