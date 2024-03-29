//leetcode 70
class Solution {
    public int climbStairs(int n) {
        if(n==0 || n==1 || n==2) return n;
        int stairs [] = new int [n];
        stairs [0] = 1;
        stairs [1] = 2;
        for(int i=2;i<n;i++){
            stairs[i]=stairs[i-2] + stairs[i-1];
        }
        return stairs[n-1];
    }
}
