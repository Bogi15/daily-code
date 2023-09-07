//leetcode 26
class Solution {
    public int removeDuplicates(int[] nums) {
        int br=0;
        for(int n : nums){
            if(br==0 || n>nums[br-1]) {
                nums[br++] = n;
            }
        }
        return br;   
    }
}
