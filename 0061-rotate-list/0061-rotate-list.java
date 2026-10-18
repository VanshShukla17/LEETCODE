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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k==0){
            return head;
        }
        k = k%len(head);
        ListNode temp = head;
        ListNode prev = new ListNode();
        int i = 0;
        while(i<k){
        while(temp.next != null){
            prev = temp;
            temp = temp.next;

        }
        prev.next = null;
        temp.next = head;
        head = temp;
        i++;
        }
    return head;
    }
    public int len(ListNode head){
        ListNode cur = head;
        int count = 0;
        while(cur !=  null){
            count++;
            cur = cur.next;
        }
    return count;
    }
}