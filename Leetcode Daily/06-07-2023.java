//leetcode 961
class Solution {
    public int repeatedNTimes(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return 0;
    }
}
