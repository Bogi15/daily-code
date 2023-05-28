//leetcode 2149.
class Solution {
    public int[] rearrangeArray(int[] nums) {
        Queue<Integer> pos = new LinkedList<>();
        Queue<Integer> neg = new LinkedList<>();
        int ans[] = new int [nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pos.add(nums[i]);
            }
            if(nums[i]<0){
                neg.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(i%2==0) {
                ans[i] = pos.peek();
                pos.remove();
            }
            if(i%2==1){
                ans[i] = neg.peek();
                neg.remove();
            }
        }
        return ans;
    }
}
