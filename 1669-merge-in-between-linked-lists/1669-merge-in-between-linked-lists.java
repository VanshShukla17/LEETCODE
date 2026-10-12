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
        ListNode afterB = cur;
        while(i<=b){
            afterB = afterB.next;
            i++;
        }
        cur.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next =  afterB.next;
    return list1;
    }
}