class Solution {
    public int maxDepth(String s) {
        int max = Integer.MIN_VALUE;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                cnt++;
            } else if (ch == ')') {
                cnt--;
            }

            if (max < cnt) {
                max = cnt;
            }
        }
        return max;
    }
}