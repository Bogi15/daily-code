//leetcode 1137
class Solution {
    public int tribonacci(int n) {
        int f = 0;
        if(n==0)return f;
        int s = 1;
        if(n==1)return s;
        int t = 1;
        if(n==2)return t;
        int result = 0, next=0;
        for(int i=3;i<=n;i++){
            next = f + s + t;
            f=s;
            s=t;
            t=next;
            result = next;
        }
        return result;
    }
}
