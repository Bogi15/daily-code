//leetcode 342
class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)return true;
        if(n<=0)return false;
        if(n/4==1 && n%4==0)return true;
        if(n%4==0){
            n=n/4;
            return isPowerOfFour(n);
        }
        return false;
    }
}
