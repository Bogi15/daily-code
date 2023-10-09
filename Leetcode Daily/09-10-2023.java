//leetcode 2206
class Solution {
    public boolean divideArray(int[] nums) {
        int a = nums.length/2;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                a--;
                i++;
            }

        }
        return a==0 ? true : false;
    }
}
