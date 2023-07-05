//leetcode 268
class Solution {
    public int missingNumber(int[] nums) {
         Arrays.sort(nums);
        int l = 0, r = nums.length, m= (l + r)/2;
        while(l<r){
        m = (l + r)/2;
        if(nums[m]>m) r = m;
        else l = m+1;
    }
    return l;
    }
}
