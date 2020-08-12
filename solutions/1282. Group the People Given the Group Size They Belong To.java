class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        List<List<Integer>> list = new ArrayList();
        for(int i = 0; i < groupSizes.length; i++){
            int current = groupSizes[i];
            List<Integer> temp = new ArrayList();
            if(map.containsKey(current))
                temp = map.get(current);
            
            temp.add(i);
            map.put(current, temp);
            if(temp.size() == current){
                list.add(temp);
                map.remove(current);
            }  
        }
        return list;
    }
}
