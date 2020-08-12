class Solution {
    public void rotate(int[][] matrix) {
        matrix = reverse(transpose(matrix));
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public int[][] reverse(int[][] matrix) {
        for(int i =0; i< matrix.length; i++) {
            for(int j = 0; j<matrix[i].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j - 1];
                matrix[i][matrix[i].length - j - 1] = temp;
            }
        }
        return matrix;
    }
    
    public int[][] transpose(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < i; j ++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
}
