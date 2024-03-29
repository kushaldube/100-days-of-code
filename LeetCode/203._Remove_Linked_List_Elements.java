/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp=head;
        ListNode prev=new ListNode(-1);
        prev.next=head;
        head=prev;

        while(temp!=null){
            if(temp.val==val){
                prev.next=temp.next;
            } else {

            prev=temp;
            }
            temp=temp.next;
            // if(prev.next==null){return head;}
        }

        return head.next;
    }
}