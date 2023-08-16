//leetcode 678
class Solution {
    public boolean checkValidString(String s) {
        int br = 0; 
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '*') {
                br++;
            } else {
                br--;
            }
            if (br < 0) {
                return false; 
            }
        }
        if (br == 0) {
            return true; 
        }
        br = 0;  
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')' || c == '*') {
                br++;
            } else {
                br--;
            }
            if (br < 0) {
                return false; 
            }
        }
        return true; 
    }
}
