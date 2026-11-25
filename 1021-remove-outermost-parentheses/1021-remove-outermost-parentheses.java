class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int i = 0 ; 
        int n = s.length();

        int cnt = 0;
        while(i<n){
            char ch = s.charAt(i);
            if(ch=='('){
                if(cnt != 0){
                    ans.append(String.valueOf(ch));
                }
            cnt++;
            }
            else{
                cnt--;
                if(cnt != 0){
                    ans.append(String.valueOf(ch));
                }                
            }
        i++;
        }
    return ans.toString();
    }
}