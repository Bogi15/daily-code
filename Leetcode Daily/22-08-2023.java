//leetcode 168
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder r = new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            r.insert(0,(char)('A'+columnNumber%26));
            columnNumber = columnNumber/26;
        }
        return r.toString();
    }
}
