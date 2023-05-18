//leetcode 747
class Solution {
    public int dominantIndex(int[] nums) {
        int len=nums.length;
        int arr [] = nums.clone();
        Arrays.sort(nums);
        if (nums[len-1]>=2*nums[len-2]){
            for(int i=0;i<len;i++)
                if(nums[len-1]==arr[i]) return i;
        }
        return -1;
    }
}
