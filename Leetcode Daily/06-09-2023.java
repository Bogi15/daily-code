//leetcode 198
class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int max=0;
        int prev_Max=0;
        for(int num : nums){
            int temp = max;
            max = Math.max(num+prev_Max,max);
            prev_Max=temp;
        }
        return max;
    }
}
