//leetcode 1161
class Solution {
    public int maxLevelSum(TreeNode root) {
        int maxSum=Integer.MIN_VALUE;
        int ans = 0 , level=0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            level++;
            int nowSum=0;
            for(int i=q.size();i>0;i--){
                TreeNode node = q.poll();
                nowSum+=node.val;
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            if(maxSum<nowSum){
                maxSum=nowSum;
                ans = level;
            }
        }
        return ans;
    }
}
