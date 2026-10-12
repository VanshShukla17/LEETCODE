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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int i = 1;
        ListNode cur = list1;
        while(i<=a-1){
            cur = cur.next;
            i++;
        }
        ListNode cur2 = cur;
        while(i<=b){
            cur2 = cur2.next;
            i++;
        }
        cur.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next =  cur2.next;
    return list1;
    }
}