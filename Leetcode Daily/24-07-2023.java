//leetcode 2023
class Solution {
    public int numOfPairs(String[] nums, String target) {
        int all=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                 if ((nums[i] + nums[j]).equals(target)) {
                    all++;
                }
                if ((nums[j] + nums[i]).equals(target)) {
                    all++;
                }
            }
        }
        return all;
    }
}
