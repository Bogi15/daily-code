//leetcode 104
class Solution {
    public int Depth(TreeNode root,int depth){
        if(root==null) return depth;
        depth++;
        int leftDepth = Depth(root.left,depth);
        int rigthDepth = Depth(root.right,depth);
        return Math.max(leftDepth,rigthDepth);
    }
    public int maxDepth(TreeNode root) {
        int depth=0;
        int a = Depth(root,depth);
        return a;
    }
}
