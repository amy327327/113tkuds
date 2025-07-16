
import java.util.Scanner;
public class Q10_ArrayToStringUtil {
    


    public static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        if (arr.length == 0) return "[]";
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = null;
        if (n > 0) {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        } else if (n == 0) {
            arr = new int[0];
        } else if (n == -1) {
            arr = null;
        }

        System.out.println(arrayToString(arr));
    }
}

    

