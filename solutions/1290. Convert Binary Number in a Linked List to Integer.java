/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(head  != null) {
            list.add(head.val);
            head = head.next;
        }
        int count = 0;
        
        int flag = 0;
        for(int i = list.size()-1; i>=0; i--) {
            
            System.out.println("value:" + i +" " + list.get(i));
            if(list.get(i) == 1 ) {
                System.out.println("pow: 2^"+ i +" " + Math.pow(2,  flag));
                count  = count + (int) Math.pow(2,  flag);
            }
            flag++;
        }
        
        return count;
    }
}
