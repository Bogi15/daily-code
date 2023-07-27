//leetcode 485
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,now=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)now++;
            if(nums[i]==0)now=0;
            max = Math.max(max,now);
        }
        return max;
    }
}
