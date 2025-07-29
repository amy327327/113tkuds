
import java.util.Scanner;
public class F01_TMRTStopCounter {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }
        String start = sc.next();
        String end = sc.next();

        int index1 = -1, index2 = -1;

        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                index1 = i;
            }
            if (stations[i].equals(end)) {
                index2 = i;
            }
        }

        if (index1 == -1 || index2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(index1 - index2) + 1);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：掃描一次站名陣列以找出起訖站的索引位置，時間與輸入站數 n 成正比。
 */

    

