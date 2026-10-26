class Solution {
    public int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stk.push(ch);
            } else {
                if (ch == ')' && !stk.isEmpty() && stk.peek() == '(' ) {
                    stk.pop();
                } else {
                    stk.push(ch);
                }
            }
        }
        while(!stk.isEmpty()){
            count++;
            stk.pop();
        }
    return count;
    }
}