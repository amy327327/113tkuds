
    import java.util.Scanner;
public class Q9_FindFiveStarStalls {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int cnt = 0;

        // 讀取評分並計算五星數量
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
            if (scores[i] == 5) cnt++;
        }

        if (cnt == 0) {
            System.out.println("None");
            return;
        }

        int[] idx = new int[cnt];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                idx[j++] = i;
            }
        }

        for (int i = 0; i < cnt; i++) {
            System.out.print(idx[i]);
            if (i < cnt - 1) System.out.print(" ");
        }
        System.out.println();
    }
}

    

