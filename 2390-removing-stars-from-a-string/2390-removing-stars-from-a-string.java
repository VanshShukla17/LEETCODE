class Solution {
    public String removeStars(String s) {
       Stack<Character> stk = new Stack<>(); 
       StringBuilder ans = new StringBuilder();
       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(ch !='*'){
            stk.push(ch);
        }
        else{
            stk.pop();
        }
    }
    while(!stk.isEmpty()){
        ans.append(stk.pop());
    }
    return ans.reverse().toString();
    }
}