//leetcode 7
class Solution {
    public int reverse(int x) {
        long y=0;
        while(x != 0){
          long temp = x % 10;
          y = temp + y * 10;
          x = x/10;
          
        }
        if(y>2147483647 || y<-2147483647) return 0;
        return  (int)y;
    }
}
