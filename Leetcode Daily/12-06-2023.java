//leetcode 383
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] az = new int[26];
        
        for (char c : magazine.toCharArray())
            az[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (az[c-'a'] == 0) return false;
            az[c-'a']--;
        }
        return true;
    }
}
