class Solution {
    public void setZeroes(int[][] matrix) {
        int rowsize =  matrix.length;
        int colsize = matrix[0].length;
        int row[] = new int[rowsize];
        int col[] = new int[colsize];
        for(int i=0;i < rowsize;i++){
            for(int j=0; j < colsize;j++){
                if(matrix[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        for(int i=0;i < rowsize;i++){
            for(int j=0; j < colsize;j++){
                if(col[j] == -1 || row[i] == -1){
                   matrix[i][j] = 0;
                }
            }
        }
    }
}