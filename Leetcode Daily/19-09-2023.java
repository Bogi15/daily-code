//leetcode 2278
class Solution {
    public int percentageLetter(String s, char letter) {
        int count=0;
        int all=s.length();
        for(char c : s.toCharArray()){
            if(c == letter) count++;
        }
        if(count == 0)return 0;
        int  a  = (count*100) / all;
        return a;
    }
}
