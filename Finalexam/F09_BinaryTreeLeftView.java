import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class F09_BinaryTreeLeftView {
    


    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取整行，轉成整數陣列（-1 表 null）
        String[] parts = sc.nextLine().split(" ");
        int[] nodes = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            nodes[i] = Integer.parseInt(parts[i]);
        }

        TreeNode root = buildTree(nodes);
        printLeftView(root);
    }

    // 根據層序陣列構建二元樹
    static TreeNode buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();
            if (arr[i] != -1) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != -1) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }

        return root;
    }

    // BFS 列印每層最左邊節點
    static void printLeftView(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        System.out.print("LeftView: ");
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (i == 0) {
                    System.out.print(current.val + " ");
                }
                if (current.left != null) queue.offer(current.left);
                if (current.right != null) queue.offer(current.right);
            }
        }
        System.out.println();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：建樹與 BFS 左視圖遍歷都會掃過每個節點一次，n 為節點總數，因此時間複雜度為 O(n)。
 */

    

