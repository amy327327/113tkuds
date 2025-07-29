
import java.util.Scanner;
public class F05_LCMRecursive {
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(Math.abs(a), Math.abs(b));
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }

    // 使用輾轉相減法遞迴求最大公因數 GCD
    public static int findGCD(int a, int b) {
        if (a == b)
            return a;
        else if (a > b)
            return findGCD(a - b, b);
        else
            return findGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉**相減法**最壞情況是每次只減 1，例如 GCD(1000, 1)，會遞迴 999 次，
 * 所以時間複雜度為 O(max(a, b))。
 * （若使用輾轉除法，則為 O(log(max(a, b)))，但本題要求相減法）
 */

    

