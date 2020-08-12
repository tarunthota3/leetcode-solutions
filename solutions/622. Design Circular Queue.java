class MyCircularQueue {
    
    int[] arr;
    int len = 0, rear = -1, front;
​
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        arr = new int[k];
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(!isFull()){
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            len++;
            return true;
        }
        else
            return false;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(!isEmpty()){
            front = (front + 1)% arr.length;
            len--;
            return true;
        }
        else
            return false;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : arr[front];
    }
    
    /** Get the last item from the queue. */
