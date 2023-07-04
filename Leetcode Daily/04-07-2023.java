//leetcode 2124
class Solution {
    public boolean checkString(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++){
            char b = s.charAt(i);
            if(b =='b') count++;
            if(b =='a' && count>0) return false;
        }
        return true;
    }
}
