

public class GradeProcessor {
    public static void main(String[] args) {
    
   
        // 1. 建立成績陣列
        int[] scores = {78, 85, 92, 67, 88, 95, 73, 90};

        int total = 0;
        int maxScore = scores[0];
        int minScore = scores[0];
        int maxIndex = 0;
        int minIndex = 0;

        // 2. 計算總分、找最高分與最低分及其索引
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];

            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxIndex = i;
            }

            if (scores[i] < minScore) {
                minScore = scores[i];
                minIndex = i;
            }
        }

        // 平均分（保留兩位小數）
        double average = total / (double) scores.length;

        System.out.println("總分: " + total);
        System.out.printf("平均分數: %.2f%n", average);
        System.out.println("最高分: " + maxScore + "，索引位置: " + maxIndex);
        System.out.println("最低分: " + minScore + "，索引位置: " + minIndex);

        // 4. 計算高於平均分的學生數量
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("高於平均分的學生人數: " + aboveAverageCount);

        // 5. 輸出所有成績（格式：「學生編號: 成績」）
        System.out.println("所有成績：");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("學生編號 " + i + ": " + scores[i]);
        }
    }}


