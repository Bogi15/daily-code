//leetcode 326
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)return true;
        while(n>0){
            int temp=n/3;
            if(temp==1 && n%3==0 ){
                System.out.print(n);
                return true;
            }
            n=temp;
        }
        return false;
    }
}
