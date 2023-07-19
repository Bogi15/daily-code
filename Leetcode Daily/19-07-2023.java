//leetcode 1394
class Solution {
    public int findLucky(int[] arr) {
        int[] rra = new int[501];
        for(int a : arr){
            rra[a]++;
        }
        for(int i=500;i>1;i--){
            if(i==rra[i]) return i;
        }
        return -1;
    }
}
