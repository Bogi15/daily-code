//leetcode 
class Solution {
    public int secondHighest(String s) {
        int a = -1, b = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int digit = c - '0';
                if (digit > a) {
                    b = a;
                    a = digit;
                } else if (digit < a && digit > b) {
                    b = digit;
                }
            }
        }
        return b;
    }
}
