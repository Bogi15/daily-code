//leetcode 1952
class Solution {
    public boolean isThree(int n) {
        int result=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)result++;
        }
        if(result==3)return true;
        else return false;
    }
}
