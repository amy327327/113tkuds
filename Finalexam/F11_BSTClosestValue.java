

public class F11_BSTClosestValue {
    
    // 定義樹節點結構
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    // 主功能：尋找最接近目標值的節點值
    public static int closestValue(TreeNode root, int target) {
        int closest = root.val;
        TreeNode curr = root;
        while (curr != null) {
            int curDiff = Math.abs(curr.val - target);
            int closestDiff = Math.abs(closest - target);
            if (curDiff < closestDiff || (curDiff == closestDiff && curr.val < closest)) {
                closest = curr.val;
            }
            // 向左或向右搜尋
            if (target < curr.val) {
                curr = curr.left;
            } else if (target > curr.val) {
                curr = curr.right;
            } else {
                break; // 相同則直接返回
            }
        }
        return closest;
    }

    // 範例測試
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(20);
        int target = 13;
        System.out.println(closestValue(root, target)); // 輸出：15
    }
}

