

public class ds_07 {
    public class TwoDArrayExample {
        public static void main(String[] args) {
            // 建立 3x3 二維陣列並初始化
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println("二維陣列元素：");
            for (int i = 0; i < matrix.length; i++) {        // 行
                for (int j = 0; j < matrix[i].length; j++) { // 列
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println(); // 換行
            }
        }
    }
    
    
}
