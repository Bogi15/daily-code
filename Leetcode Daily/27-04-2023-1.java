//leetcode 2544
class Solution {
    public int alternateDigitSum(int n) {
    int ans = 0;
    int p = 0;
    int prob=n;
    while(prob>0){
        p++;
        prob=prob/10;
    }
    while (n > 0) {
        if (p % 2 == 0) {
            ans += n % 10;
        } else {
            ans -=  n % 10;
        }
        n /= 10;
        p--;
    }
        return ans*-1;
    }
}
