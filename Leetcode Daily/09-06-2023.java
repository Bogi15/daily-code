//leetcode 744
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int a [] = new int[letters.length];
        int num = (int) target;
        for(int i=0;i<letters.length;i++){
            a[i]= (int) letters[i];
        }
        if(num<a[0]) return (char) a[0];
        for(int b:a){
            if(b>num) return (char)b;
        }
        return (char) a[0];
    }
}
