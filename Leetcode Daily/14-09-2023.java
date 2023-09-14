//leetcode 674
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int prev_max = 0;
        int max = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
               prev_max++;
            }
            else{
                max = Math.max(max,prev_max);
                prev_max=0;
            }
        }
        return Math.max(max,prev_max)+1;
    }
}
