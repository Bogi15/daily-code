//leetcode 1561
class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int max=0;
        int k=2;
        for(int i=0;i<piles.length/3;i++){
            max += piles[piles.length-k];
            k+=2;
        }
        return max;
    }
}
