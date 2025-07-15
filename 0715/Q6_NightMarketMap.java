
import java.util.Scanner;
public class Q6_NightMarketMap {
  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 建立 10x10 地圖，預設填 #
        char[][] map = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                map[i][j] = '#';
            }
        }

        // 讀取攤位數量
        int m = sc.nextInt();

        // 依序讀取每個座標，若合法則標記為 *
        for (int i = 0; i < m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (r >= 0 && r < 10 && c >= 0 && c < 10) {
                map[r][c] = '*';
            }
        }

        // 輸出地圖
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}

    

