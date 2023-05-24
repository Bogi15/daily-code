//leetcode 1832
class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> letters = new HashSet<Character>();
        for(int i=0;i<sentence.length();i++){
            letters.add(sentence.charAt(i));
        }
        if(letters.size()!=26) return false;
        else return true; 
    }
}
