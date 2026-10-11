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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = length(head);
        int index = len-n;
        int i = 1;
        if(head == null){
            return null;
        }
        if(head.next ==null && n==1){
            return null;
        }
        if(index == 0){
            head = head.next;
            return head;
        }
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if(i==index){
                temp.next=temp.next.next;
                return head; 
            }
            else{
                temp = temp.next;
                i++;
            }
        }
    return head;    
    }
    public static int length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
    return len;
    }
}