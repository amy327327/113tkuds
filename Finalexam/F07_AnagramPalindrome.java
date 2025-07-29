
import java.util.Scanner;

public class F07_AnagramPalindrome {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int[] freq = new int[26];  // 英文字母 a~z 的頻率表

        for (char ch : line.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                freq[ch - 'a']++;
            }
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 == 1) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
    /*
 * Time Complexity: O(n)
 * 說明：掃描輸入字串一次 O(n)，建立字母頻率表。之後再掃一次 26 個字母 O(1)，
 * 所以總時間複雜度為 O(n)，其中 n 為輸入字串長度。
 */

}


    

