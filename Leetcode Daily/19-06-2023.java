//leetcode 1732
class Solution {
    public int largestAltitude(int[] gain) {
        int now = 0;
        int max=now;
        for(int attitude : gain){
            now += attitude;
            max = Math.max(now,max);
        }
        return max;
    }
}
