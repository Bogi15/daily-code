//leetcode 1512
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
                if(nums[i] == nums[j] && i < j) ans++;
            }
        }
        return ans;
    }
}
