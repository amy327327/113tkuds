

import java.util.Scanner;
public class q7permutation {
    public class Permutations {
        static int ops = 0;
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
    
            boolean[] used = new boolean[n + 1]; 
            
            int[] perm = new int[n];
    
            generate(perm, used, 0, n);
    
            System.out.println(ops);
    
            sc.close();
        }
    
        static void generate(int[] perm, boolean[] used, int depth, int n) {
            if (depth == n) {
                ops++;
                for (int i = 0; i < n; i++) {
                    System.out.print(perm[i]);
                    if (i < n - 1) System.out.print(" ");
                }
                System.out.println();
                return;
            }
    
            for (int i = 1; i <= n; i++) {
                if (!used[i]) {
                    used[i] = true;
                    perm[depth] = i;
                    generate(perm, used, depth + 1, n);
                    used[i] = false;
                }
            }
        }
    
}}
