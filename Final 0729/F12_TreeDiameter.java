

public class F12_TreeDiameter {
   
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    static int diameter = 0;

    public static int treeDiameter(TreeNode root) {
        diameter = 0;
        getHeight(root);
        return diameter;
    }

    // 後序遞迴獲取高度並同時計算直徑
    private static int getHeight(TreeNode node) {
        if (node == null) return 0;
        int lh = getHeight(node.left);
        int rh = getHeight(node.right);
        // 更新最大直徑：兩邊高度相加
        diameter = Math.max(diameter, lh + rh);
        return Math.max(lh, rh) + 1;
    }

    // 範例測試
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(treeDiameter(root)); // 輸出：3
    }
}



    

