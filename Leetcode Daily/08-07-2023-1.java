//leetcode 1941
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        Integer freq = null;
        for (int charCount : count.values()) {
            if (freq == null) {
                freq = charCount;
            } else if (charCount != freq) {
                return false;
            }
        }
        
        return true;
    }
}
