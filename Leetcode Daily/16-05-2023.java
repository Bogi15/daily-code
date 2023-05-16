//leetcode 2011
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num = 0;
        for(String s : operations){
            if (s.equals("++X") || s.equals("X++")) num += 1;
            if (s.equals("--X") || s.equals("X--")) num -= 1;
        }
        return num;
    }
}
