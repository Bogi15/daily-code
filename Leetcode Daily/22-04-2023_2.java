//leetcode 2315

class Solution {
    public int countAsterisks(String s) {
        int br=0;
        int sigh = -1;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c == '|') sigh = sigh*-1;
            if(c == '*' && sigh == -1) br++;
        }
        return br;
    }
}
