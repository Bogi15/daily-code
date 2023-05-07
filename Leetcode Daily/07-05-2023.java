//leetcode 1689
class Solution {
    public int minPartitions(String n) {
        int tem=0;
        for(int i=0;i<n.length();i++){
            if(Character.getNumericValue(n.charAt(i)) > tem) tem = Character.getNumericValue(n.charAt(i));
        }
        return tem;
    }
}
