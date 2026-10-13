class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        int i = 0 ;
        int n = s.length();

        while(i < n){
            char ch = s.charAt(i);
            if(ch == '('){
                if(count != 0){
                    ans.append(String.valueOf(ch));
                }
                count++;
            }
            else{
                count--;
                if(count != 0){
                    ans.append(String.valueOf(ch));
                }
            }
        i++;
        }
    return ans.toString();
    }
}