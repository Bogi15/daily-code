//leetcode 2708
class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        int pos=0,zero=0,neg=0;
        long all=1;
        for(int num:nums){
            if(num>0)pos++;
            else if (num<0)neg++;
            else zero++;
        }
        if(pos==0 && neg==1 && nums.length>1)return 0;
        if(zero==nums.length)return 0;
        if(nums.length==1)return nums[0];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == neg - 1 && nums[i] < 0 && neg%2!=0 ) {
                count++;
                continue;
            }
            if (nums[i] != 0) {
                all *= nums[i];
            }
            count++;
        }
        
        return all;
    }
}
