
 import java.util.Scanner;
public class F06_ArraySecondLargest {
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        Pair result = findMaxAndSecond(arr, 0, n - 1);
        System.out.println("SecondMax: " + result.second);
    }

    // 回傳最大值與第二大值
    static Pair findMaxAndSecond(int[] arr, int left, int right) {
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE); // 單一元素
        }

        int mid = (left + right) / 2;
        Pair leftPair = findMaxAndSecond(arr, left, mid);
        Pair rightPair = findMaxAndSecond(arr, mid + 1, right);

        int max, second;

        if (leftPair.max > rightPair.max) {
            max = leftPair.max;
            second = Math.max(leftPair.second, rightPair.max);
        } else {
            max = rightPair.max;
            second = Math.max(rightPair.second, leftPair.max);
        }

        return new Pair(max, second);
    }

    static class Pair {
        int max, second;
        Pair(int max, int second) {
            this.max = max;
            this.second = second;
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：整個遞迴類似於 Merge Sort，每個元素只會被處理一次，左右各處理一半並合併，
 * 所以總共掃描一次陣列，每個合併步驟是 O(1)，故總時間複雜度為 O(n)。
 */

    

