//leetcode 1816
class Solution {
    public String truncateSentence(String s, int k) {
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(k==0) return s.substring(0,i-1);
            if(c == ' ')k--;
        }
        return s;
    }
}
