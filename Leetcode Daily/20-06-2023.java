//leetcode 1374
class Solution {
    public String generateTheString(int n) {
        StringBuilder z  = new StringBuilder();
        if(n % 2 == 0) {
            int num=n-1;
            for(int i=0;i<num;i++){
                z.append("x");
            }
            z.append("y");
        }
        else{
            for(int i=0;i<n;i++){
                z.append("x");
            }
        }
        return z.toString();
    }
}
