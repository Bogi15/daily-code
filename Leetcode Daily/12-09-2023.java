//leetcode 122
class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MIN_VALUE;
        int sell=0;
        for(int price : prices){
            buy = Math.max(buy,sell-price);
            sell = Math.max(sell,buy+price);
        } 
        return sell;
    }
}
