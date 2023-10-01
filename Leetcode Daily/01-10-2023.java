//leetcode 557
class Solution {
    public String reverseWords(String s) {
       String[] words = s.split(" ");
       StringBuilder build = new StringBuilder();
       for( String word : words) {
           build.append(reverseWord(word)).append(" ");
       }
       return build.toString().trim();
    }
    public String reverseWord(String x){
        StringBuilder reversed = new StringBuilder();
        for (int i = x.length() - 1; i >= 0; i--) {
            char c = x.charAt(i);
            reversed.append(c);
        }
        return reversed.toString();
    }
}
