class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(isValidRow(board) && isValidColumn(board) && isValidGrid(board))
            return true;
        else
            return false;
    }
    public boolean isValidRow(char[][] board) {
        for(int i = 0; i< board.length; i++) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            for(int j = 0; j <board[i].length; j++) {
                if(board[i][j]!='.') {
                    int val = Integer.parseInt(String.valueOf(board[i][j]));
                    if( val > 9) return false;
                    if(hashMap.containsKey(val)) {
                        hashMap.put(val, hashMap.get(val) + 1);
                    }   
                    else {
                        hashMap.put(val, 1);
                    }
                }
                else
                    continue;
            }
            for(int key : hashMap.keySet()) {
                if(hashMap.get(key) > 1)
                    return false;
            }
            
        }
        return true;
    }
    
    public boolean isValidColumn(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            Map<Integer, Integer> hashMap = new HashMap<>();
            for(int j = 0; j < board[i].length; j ++) {             
                if(board[j][i]!='.') {
                    int val = Integer.parseInt(String.valueOf(board[j][i]));
