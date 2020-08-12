class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones)
            queue.add(i);
        
        while(queue.size() > 1){
            int x = queue.remove();
            int y = queue.remove();
            
            if(x!=y){
                queue.add(x-y);
            }
        }
        
        System.out.println(queue.size());
        return queue.size() == 1 ?
                queue.remove() :
                0;
​
    }
}
