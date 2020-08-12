class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            if(diff < min){
                min = diff;
                list.clear();
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
            else if(diff == min){
                list.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return list;
        
    }
}
