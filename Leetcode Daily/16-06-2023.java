//leetcode 441
class Solution {
    public int arrangeCoins(int n) {
       int stairs=1;
       while(n>0){
        stairs++;
        n=n-i;
       }
       return stairs-1;
    }
}
