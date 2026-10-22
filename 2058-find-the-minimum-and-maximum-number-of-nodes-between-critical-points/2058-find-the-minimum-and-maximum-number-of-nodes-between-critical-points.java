class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;
        int firstCritical = -1;
        int lastCritical = -1;
        int minDist = Integer.MAX_VALUE;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (firstCritical == -1) {
                    firstCritical = index;
                } else {
                    minDist = Math.min(minDist, index - lastCritical);
                }

                lastCritical = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (firstCritical == lastCritical) {
            return ans;
        }

        int maxDist = lastCritical - firstCritical;

        ans[0] = minDist;
        ans[1] = maxDist;

        return ans;
    }
}