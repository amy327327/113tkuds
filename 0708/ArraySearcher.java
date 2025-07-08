public class ArraySearcher {

    public static char getGrade(int score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else {
            return 'D';
        }
    }

    public static double getAverage(int[] scores) {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int maxScore = scores[0], minScore = scores[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            char grade = getGrade(score);

            switch (grade) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }

            if (score > maxScore) {
                maxScore = score;
                maxIndex = i;
            }
            if (score < minScore) {
                minScore = score;
                minIndex = i;
            }
        }

        double average = getAverage(scores);
        int countAboveAvg = 0;

        for (int score : scores) {
            if (score > average) {
                countAboveAvg++;
            }
        }

        double proportionAboveAvg = (double) countAboveAvg / scores.length * 100;

        System.out.println("學生分數等級報告");
        System.out.println("====================");
        System.out.printf("最高分: %d (學生編號: %d)\n", maxScore, maxIndex + 1);
        System.out.printf("最低分: %d (學生編號: %d)\n", minScore, minIndex + 1);
        System.out.printf("班級平均分數: %.2f\n", average);
        System.out.printf("高於平均分數學生比例: %.2f%%\n", proportionAboveAvg);
        System.out.println("--------------------");
        System.out.printf("%-6s %-6s %-6s\n", "編號", "分數", "等級");
        System.out.println("--------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-6d %-6d %-6c\n", i + 1, scores[i], getGrade(scores[i]));
        }
    }
}


