//leetcode 1365
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] count = new int[101]; 
        int[] result = new int[n];

        for (int num : nums) {
            count[num]++;
        }
        for (int i = 1; i <= 100; i++) {
            count[i] += count[i - 1];
        } 
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result[i] = count[nums[i] - 1];
            }
        }
        
        return result;
    }
}
