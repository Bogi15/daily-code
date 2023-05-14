//leetcode 2335
class Solution {
    public int fillCups(int[] amount) {
        int br=0,num=0;
        for(int i=0;i<amount.length;i++){
            br = Math.max(amount[i],br);
            num += amount[i];
        }
        return Math.max(br,(num+1)/2);
    }
}
