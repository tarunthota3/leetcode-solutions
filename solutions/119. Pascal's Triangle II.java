class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allRows = new ArrayList<List<Integer>>();
        // if(rowIndex == 0)
        //     return ;
        
        allRows.add(new ArrayList<Integer>());
        allRows.get(0).add(1);
        
        for(int i = 1; i < rowIndex+1; i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = allRows.get(i-1);
            
            row.add(1);
            for(int j = 1; j < i; j++){
                row.add(prevRow.get(j-1) + prevRow.get(j));
            }
            row.add(1);
            allRows.add(row);
        }
        System.out.println(allRows);
        return allRows.get(rowIndex);
    }
}
