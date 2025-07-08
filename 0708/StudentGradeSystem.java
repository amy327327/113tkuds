

public class StudentGradeSystem {


    // 方法：根據分數回傳等級
    static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    // 方法：列印完整成績報告
    static void printReport(int[] scores) {
        int[] gradeCount = new int[4]; // A:0, B:1, C:2, D:3
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;
        int sum = 0;

        // 統計分數總和、最高、最低、等級人數
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }

            char grade = getGrade(score);
            switch (grade) {
                case 'A': gradeCount[0]++; break;
                case 'B': gradeCount[1]++; break;
                case 'C': gradeCount[2]++; break;
                case 'D': gradeCount[3]++; break;
            }
        }

        double average = (double) sum / scores.length;

        // 計算高於平均的學生比例
        int aboveAvgCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAvgCount++;
            }
        }
        double aboveAvgPercentage = (double) aboveAvgCount / scores.length * 100;

        // 輸出報告
        System.out.println("=========== 學生成績報告 ===========");
        System.out.println("總人數: " + scores.length);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.println("最高分: " + max + "（學生編號 " + maxIndex + "）");
        System.out.println("最低分: " + min + "（學生編號 " + minIndex + "）");
        System.out.printf("高於平均分的學生比例: %.2f%%\n", aboveAvgPercentage);

        System.out.println("\n各等級人數：");
        System.out.println("A 等級 (90↑): " + gradeCount[0]);
        System.out.println("B 等級 (80-89): " + gradeCount[1]);
        System.out.println("C 等級 (70-79): " + gradeCount[2]);
        System.out.println("D 等級 (<70): " + gradeCount[3]);

        System.out.println("\n----------- 詳細成績列表 -----------");
        System.out.printf("%-8s%-8s%-8s\n", "編號", "分數", "等級");
        System.out.println("-------------------------------");

        for (int i = 0; i < scores.length; i++) {
            char grade = getGrade(scores[i]);
            System.out.printf("%-8d%-8d%-8c\n", i, scores[i], grade);
        }

        System.out.println("====================================");
    }

    public static void main(String[] args) {
        // 1. 建立學生分數陣列
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        // 2 & 3. 列印成績報告
        printReport(scores);
    }
}

    

