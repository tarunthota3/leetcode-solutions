/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = new ListNode(-1);
        ListNode next;
        while(head != null){
            if(head == temp)
                return true;
            next = head.next;
            head.next = temp;
            head = next;
        }
        return false;
    }
}
