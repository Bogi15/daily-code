//leetcode 434
class Solution {
    public int countSegments(String s) {
        if(s.equals(""))return 0;
        int result =0;
        for(int i=0;i<s.length();i++){
            char d = s.charAt(i);
            if((i==0 || s.charAt(i-1) == ' ') && d != ' '){
                result++;
            }     
        }
        return result;
    }
}
