//leetcode 2169
class Solution {
    public int a=0;
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0)return a;
        if(num1==num2 && a==0)return 1;
        if(num1>=num2){
            num1-=num2;
            a++;
            return countOperations(num1,num2);
        }else{
            num2-=num1;
            a++;
            return countOperations(num1,num2);
        }
    }
}
