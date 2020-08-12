/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> nodes = new HashSet<>();
        ListNode hA = headA;
        while(hA != null){
            nodes.add(hA);
            hA = hA.next;
        }
        if(nodes.isEmpty()){
            return null;
        }
        ListNode hB = headB;
        while(hB != null){
            if(nodes.contains(hB)){
                return hB;
            }
            hB = hB.next;
        }
        return null;
    }
}
