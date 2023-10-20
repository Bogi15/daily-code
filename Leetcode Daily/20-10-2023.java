//leetcode 1837
class Solution {
    public int sumBase(int n, int k) {
        int a = convertBase(n,k);
        int result=0;
        while(a!=0){
            result = result + a%10;
            a=a/10;
        }
        return result;
    }
    public int convertBase(int a, int b){
        int number=0,c=1;
        while(a!=0){
            int d=a%b;
            number = number + d*c; 
            a=a/b;
            c=c*10;
        }
        return number;
    }
}
