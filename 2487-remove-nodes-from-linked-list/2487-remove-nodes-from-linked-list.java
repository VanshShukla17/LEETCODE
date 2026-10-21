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
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        ListNode next;


        while(cur != null) {
            next = cur.next;      
            cur.next = prev;      
             prev = cur;           
            cur = next;           
        }
        head = prev;
        ListNode temp = head ; 
        int max = temp.val;
        while(temp.next != null){
            if(temp.next.val < max){
                temp.next = temp.next.next;
            }
            else{
                max = temp.next.val;
                temp = temp.next;
            }
        }
        prev = null;
        cur = head;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur ; 
            cur = next;
        }
    return prev;
    }
}