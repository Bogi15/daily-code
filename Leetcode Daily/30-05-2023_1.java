//leetcode 125
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String s1 = ""; 
        String s2 = ""; 
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)) s1 = s1 + c;
        }
        for (int i=0; i<s1.length(); i++){
            char c = s1.charAt(i); 
            s2 = c+s2; 
        }
        if(s1.equals(s2)) return true;
        else return false;
    }
}//1
