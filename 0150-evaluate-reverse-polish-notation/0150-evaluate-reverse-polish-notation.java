class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        int n = tokens.length;
        for(int i =0 ; i< n ;i++){
            String str = tokens[i];


    if(!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") ){
                stk.push(Integer.parseInt(str));
            }
            else{
                int num2 = stk.pop();
                int num1 = stk.pop();
                if(str.equals("+")){
                    stk.push(num1+num2);
                }
                else if(str.equals("-")){
                    stk.push(num1-num2);
                }
                else if(str.equals("*")){
                    stk.push(num1*num2);
                }
                else if(str.equals("/")){
                    stk.push(num1/num2);
                }
            }
        }
    return stk.pop();
    }
}