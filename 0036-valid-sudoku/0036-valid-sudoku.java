class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for(int i=0; i < 9; i++){
            for(int j=0; j < 9; j++){
                char val = board[i][j];
                if(val == '.'){
                    continue;
                }
                String row = " the value"+val+"in row "+i;
                String col = " the value"+val+"in col "+j;
                int boxindex = (i/3)*3+ (j/3);
                String box = "the value"+ val+" in box"+boxindex;
                if(set.add(row) == false || set.add(col) == false || set.add(box) == false){
                    return false;
                }

            }
        }
        return true;
    }
}