import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class F10_BSTRangeSum {
    


    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // 使用 queue 輸入 -1 表示 null，建樹（層序建構）
    static TreeNode buildTree(Queue<Integer> nodes) {
        if (nodes.isEmpty()) return null;
        int val = nodes.poll();
        if (val == -1) return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            if (nodes.isEmpty()) break;

            int leftVal = nodes.poll();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

            if (nodes.isEmpty()) break;

            int rightVal = nodes.poll();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.offer(current.right);
            }
        }
        return root;
    }

    static int rangeSumBST(TreeNode root, int L, int R) {
        if (root == null) return 0;

        // 剪枝邏輯
        if (root.val < L) {
            return rangeSumBST(root.right, L, R);
        } else if (root.val > R) {
            return rangeSumBST(root.left, L, R);
        } else {
            return root.val +
                   rangeSumBST(root.left, L, R) +
                   rangeSumBST(root.right, L, R);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 輸入：BST 節點層序（-1 表 null）
        String[] input = sc.nextLine().split(" ");
        Queue<Integer> nodes = new LinkedList<>();
        for (String s : input) {
            nodes.offer(Integer.parseInt(s));
        }

        // 輸入區間 [L, R]
        int L = sc.nextInt();
        int R = sc.nextInt();

        TreeNode root = buildTree(nodes);
        int sum = rangeSumBST(root, L, R);
        System.out.println("RangeSum: " + sum);
    }
}

    

