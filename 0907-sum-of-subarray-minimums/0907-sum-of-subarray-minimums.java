class Solution {
    public int sumSubarrayMins(int[] arr) {
        long mod = 1000000007L;
        long answer = 0;
        int n = arr.length;
        int[] prev = previouSmall(arr);
        int[] next = nextSmall(arr);
        int leftChoice,rightChoice;

        for(int i = 0 ; i < arr.length ; i++){
            leftChoice = i - prev[i];
            rightChoice = next[i] - i;
            long total = (((leftChoice*rightChoice)%mod)*arr[i])%mod;
            answer = (answer + total) % mod;
        }
    return (int)answer;
    }
    public static int[] previouSmall(int []arr){
        int n = arr.length;
        int[] prevS = new int [n];
        Arrays.fill(prevS , -1);
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            if(!stk.isEmpty()){
                prevS[i] = stk.peek();
            }
        stk.push(i);
        }
    return prevS;
    }

    public static int[] nextSmall(int []arr){
        int n = arr.length;
        int[] nextS = new int [n];
        Arrays.fill(nextS , n);   
        Stack<Integer> stk = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){
        while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
            stk.pop();
        }
        if(!stk.isEmpty()){
                nextS[i] = stk.peek();
            }
        stk.push(i);                    
        }
    return nextS;
    }
}