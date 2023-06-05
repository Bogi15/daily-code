//leetcode 1232
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
        return true; 
    }
    
    int[] f = coordinates[0];
    int[] s = coordinates[1];
    
    int xDiff = s[0] - f[0];
    int yDiff = s[1] - f[1];
    
    for (int i = 2; i < coordinates.length; i++) {
        int[] currentPoint = coordinates[i];
        
        if (xDiff * (currentPoint[1] - f[1]) != yDiff * (currentPoint[0] - f[0])) {
            return false; 
        }
    }
    
    return true;
}
    
}
