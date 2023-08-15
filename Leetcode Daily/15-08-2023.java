//leetcode 
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<Integer>();
        int row = 0;
        int rows = matrix.length - 1;
        int col = 0;
        int cols = matrix[0].length - 1;

        while (row <= rows && col <= cols) {
            for (int i = col; i <= cols; i++) {
                list.add(matrix[row][i]);
            }
            row++;

            for (int i = row; i <= rows; i++) {
                list.add(matrix[i][cols]);
            }
            cols--;

            if (row <= rows) {
                for (int i = cols; i >= col; i--) {
                    list.add(matrix[rows][i]);
                }
                rows--;
            }

            if (col <= cols) {
                for (int i = rows; i >= row; i--) {
                    list.add(matrix[i][col]);
                }
                col++;
            }
        }
        return list;
    }
}
