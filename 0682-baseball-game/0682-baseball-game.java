class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < operations.length ; i++){
            if(operations[i].equals("+")){
                int num1 = stk.pop();
                int num2 = stk.pop();
                int total = num1+num2;
                stk.push(num2);
                stk.push(num1);
                stk.push(total);
            }
            else if(operations[i].equals("D")){
                int prev = stk.peek()*2;
                stk.push(prev);
            }
            else if(operations[i].equals("C")){
                stk.pop();
            }
            else{
                stk.push(Integer.parseInt(operations[i]));
            }
        }
    int sum = 0;
        while(!stk.isEmpty()){
            sum += stk.pop();
        }

        return sum;
    }
}