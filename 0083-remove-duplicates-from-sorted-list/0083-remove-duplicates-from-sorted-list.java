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
    public ListNode deleteDuplicates(ListNode head) {
        int size = size(head);
        if(size==0){
            return head;
        }
        int index = 0;
        remove(head , 0 ,size);
        return head;
    }
    public static int size(ListNode head){
        ListNode temp=head;
        int size=0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
    return size;
    }

    public static void remove(ListNode current , int index , int size){
        if(index==size-1){
            return;
        }
        if(current.val == current.next.val){
            current.next = current.next.next;
            size--;
            remove(current,index,size);
        }
        else{
            remove(current.next,index+1,size);
        }
    }
}