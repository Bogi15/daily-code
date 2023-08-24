//leetcode 520
class Solution {
    public boolean detectCapitalUse(String word) {
        int capitalLetters=0;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(c<91) capitalLetters++;
        }
        if(capitalLetters==word.length() || capitalLetters==0)return true;
        return capitalLetters == 1 && Character.isUpperCase(word.charAt(0));
    }
}
