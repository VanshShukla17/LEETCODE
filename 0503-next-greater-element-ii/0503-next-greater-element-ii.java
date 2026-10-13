class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> stk = new Stack<>();
        int n = nums.length;
        for(int i = (2*n)-1 ; i>=0 ; i--){
            while(!stk.isEmpty() && stk.peek()<=nums[i%n]){
                stk.pop();
            }
        if(i<n){
            if(stk.isEmpty()){
                nge[i]=-1;
            }
            else{
                nge[i]=stk.peek();
            }
        }
        stk.push(nums[i%n]);
        }
    return nge;
    }
}