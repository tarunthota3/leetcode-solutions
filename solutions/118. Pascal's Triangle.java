class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        if(numRows == 0)
            return allRows;
        
        allRows.add(new ArrayList<Integer>());
        allRows.get(0).add(1);
        
        for(int i = 1; i < numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = allRows.get(i-1);
            
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            allRows.add(row);
        }
        return allRows;
    }
}
