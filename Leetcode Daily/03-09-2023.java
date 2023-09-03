//leetcode 169
class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        int majorityE = -1;
        int majorityC = 0;
        for (int num : map.keySet()) {
            int count = map.get(num);
            if (count > majorityC) {
                majorityE = num;
                majorityC = count;
            }
        }
        if (majorityC > nums.length / 2) {
            return majorityE;
        }
        return -1;
    }
}
