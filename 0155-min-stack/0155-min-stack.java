class MinStack {
        Stack<Integer> stk = new Stack<>();
        Stack<Integer> min = new Stack<>();
    public MinStack() {
        Stack<Integer> stk ;
        Stack<Integer> min ;
    }
    
    public void push(int value) {
        stk.push(value);
        if(min.isEmpty() || value <= min.peek()) {
            min.push(value);
        }
    }
    
    public void pop() {
        if(stk.isEmpty()){
            return;
        }
        if(min.peek().equals(stk.peek())){
            min.pop();
        }
        stk.pop();
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */