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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head ==null || head.next == null || left==right){
            return head;
        }
        ListNode cur = head;
        ListNode prev = null;
        int i=1;
        while(cur != null && i != left){
            prev = cur;
            cur = cur.next;
            i++;
        }
        ListNode startPointer = prev;
        ListNode start = cur;
        while(cur != null && i!=right+1){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
            i++;
        }
        start.next = cur;
        if(startPointer!=null){
            startPointer.next = prev;
        }
        else{
            return prev;
        }
    return head;
    }
}