//leetcode 2562
class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long ans=0;
        while (nums.length != 0){
            if(nums.length>1){
            String num_ans=Integer.toString(nums[0])+Integer.toString(nums[nums.length-1]);
            ans = ans + Integer.parseInt(num_ans);
            nums = Arrays.copyOfRange(nums, 1, nums.length - 1);
        }
        else{
            ans = ans + nums[0];
            nums = Arrays.copyOfRange(nums, 1, nums.length);
        }
        }
    return ans;
    }
}
