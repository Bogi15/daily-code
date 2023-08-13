//leetcode 45
class Solution {
    public int jump(int[] nums) {
        if(nums.length == 0 || nums.length == 1 )return 0;
        int current_max=nums[0];
        int last_max=nums[0];
        int jumps=1;
        for(int i=1;i<nums.length;i++){
            if(i==nums.length-1){
                return jumps;
            }
            if(current_max < nums[i] + i){
                current_max = i + nums[i];
            }
            last_max--;
            if(last_max == 0){
                jumps++;
                last_max = current_max -i;
            }
        }
        return jumps;
    }
}
