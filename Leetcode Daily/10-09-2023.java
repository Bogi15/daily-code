//leetcode 1572
class Solution {
    public int diagonalSum(int[][] mat) {
        int result=0;
        for(int i=0;i<mat.length;i++){
            result += mat[i][i];
            result += mat[mat.length-1-i][i];
        }
        if(mat.length % 2 == 1){
            result -= mat[mat.length/2][mat.length/2];
        }
        return result;
    }
}
