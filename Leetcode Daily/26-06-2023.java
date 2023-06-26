//leetcode 2441
class Solution {
    public int findMaxK(int[] nums) {
    HashSet<Integer> seen = new HashSet<>();
    int maxK = -1;
    for (int i : nums) seen.add(i);
    for (int num : nums) {
      if (seen.contains(-num) && num > maxK ) {
        maxK = Math.max(maxK,num);
      }
    }
    return maxK;
  }
}
