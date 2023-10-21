//leetcode 1716
class Solution {
    public int totalMoney(int n) {
        int money = 0;
        for(int i=0;i<n;i++){
            int a = i/7;
            int b = i%7;
            money = money + a+b+1;
        }
        return money;
    }
}
