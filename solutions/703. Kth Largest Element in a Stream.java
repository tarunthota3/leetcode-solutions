class KthLargest {
    PriorityQueue<Integer> pQueue;
    int k;
​
    public KthLargest(int k, int[] nums) {
        pQueue = new PriorityQueue();
        this.k = k;
        for(int i : nums)
            add(i);
    }
    
    public int add(int val) {
        if(pQueue.size() < k)
            pQueue.offer(val);
        else if(pQueue.peek() < val){
            pQueue.poll();
            pQueue.offer(val);
        }
        return pQueue.peek();
    }
}
​
/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
