import java.util.Scanner;
public class Linearseach {
   
  

   
        /**
         * 基本線性搜尋：找到第一個符合的元素
         * 時間複雜度：最佳 O(1)，最壞 O(n)，平均 O(n/2)
         * 空間複雜度：O(1)
         */
        static int linearSearch(int[] array, int target) {
            int comparisons = 0;
    
            for (int i = 0; i < array.length; i++) {
                comparisons++;
                System.out.printf("第 %d 次比較：array[%d] = %d，目標值 = %d\n", 
                                comparisons, i, array[i], target);
    
                if (array[i] == target) {
                    System.out.printf("找到目標值！總共比較了 %d 次\n", comparisons);
                    return i;  // 找到了，回傳索引位置
                }
            }
    
            System.out.printf("找不到目標值，總共比較了 %d 次\n", comparisons);
            return -1;  // 找不到，回傳 -1
        }
    
        /**
         * 進階線性搜尋：找到所有符合的元素位置
         */
        static int[] linearSearchAll(int[] array, int target) {
            int count = 0;
            for (int value : array) {
                if (value == target) {
                    count++;
                }
            }
    
            if (count == 0) {
                return new int[0];  // 回傳空陣列
            }
    
            int[] result = new int[count];
            int resultIndex = 0;
    
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    result[resultIndex++] = i;
                }
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // 讓使用者
    
    }}
    
    

