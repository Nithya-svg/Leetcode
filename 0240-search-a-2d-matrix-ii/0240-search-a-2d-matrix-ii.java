class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0, bottom = matrix.length-1;
        int left =0,right= matrix[0].length-1;
       
        while(left<= right && top <= bottom){
            for(int i= left;i<= right;i++){
                if(matrix[top][i] == target){
                    return true;
                }
                
            }
            top++;


        }
        return false;
        
    }
}