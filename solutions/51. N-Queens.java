class Solution {
    List<List<String>> out = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        solveQueen(new int[n][n], 0, new HashSet<>(), new HashSet<>(), new HashSet<>());
        return out;
    }
    public void solveQueen(int[][] board, int i, Set<Integer> diagonal, Set<Integer> diagonal2, Set<Integer> vertical){
        if(i == board.length){
            addToList(board);
            return;
        }
        for(int j = 0;j < board.length; j++){
            if(!diagonal.contains(i+j) && !diagonal2.contains(j-i) && !vertical.contains(j)){
                board[i][j] = 1;
                diagonal.add(i+j);
                diagonal2.add(j-i);
                vertical.add(j);
                solveQueen(board, i+1, diagonal, diagonal2, vertical);
                board[i][j] = 0;
                diagonal.remove(i+j);
                diagonal2.remove(j-i);
                vertical.remove(j);
            }
        }
    }
    public void addToList(int[][] board){
        List<String> list = new ArrayList<>();
        for(int i = 0; i < board.length; i++){
            String temp = "";
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == 0){
                    temp+=".";
                }
                else{
                    temp+="Q";
                }
            }
            list.add(temp);
        }
        out.add(list);
    }
}
