//leetcode 2396
class Solution {
    public boolean isStrictlyPalindromic(int n) {
        boolean a = true;
        for(int i=2;i<n-1;i++){
            if(!check(Integer.toString(n,i))){
                a = false;
                break;
            }
        }
        return a;
    }
    public boolean check(String n){
        int l = 0;
        int r = n.length()-1;
        while(l<r){
            if(n.charAt(l)!=n.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }
}
