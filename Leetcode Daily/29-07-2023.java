//leetcode 260
class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        int a [] = new int [2];
        if(nums.length==2)return nums;
        for(int i=0;i<nums.length;){
            if(i!=nums.length-1 && nums[i]==nums[i+1]) i+=2;
            else {
                if(a[0]==0) a[0]=nums[i];
                else a[1]=nums[i];
                i++;
            } 
        }
        return a;
    }
}
