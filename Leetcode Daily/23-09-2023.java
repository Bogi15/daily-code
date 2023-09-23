//leetcode 551
class Solution {
    public boolean checkRecord(String s) {
        int absense=0;
        int late=0;
        for(char c : s.toCharArray()){
            if(c == 'A'){
                absense++;
                late =0;
            }
            else if(c == 'L'){
                late++;
                if(late == 3)return false;
            } 
            else {
                late=0;
            }
        }
        if(absense >= 2 ) return false;
        return true;
    }
}
