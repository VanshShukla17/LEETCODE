class Solution {
    public long subArrayRanges(int[] nums) {
        return sumSubarrayMaxs(nums) - sumSubarrayMins(nums);
    }

    public static long sumSubarrayMins(int[] arr) {
        long answer = 0;
        int n = arr.length;
        int[] prev = previouSmall(arr);
        int[] next = nextSmall(arr);
        long leftChoice,rightChoice;

        for(int i = 0 ; i < arr.length ; i++){
            leftChoice = i - prev[i];
            rightChoice = next[i] - i;
            long total = (long)(((leftChoice*rightChoice))*arr[i]);
            answer = (answer + total) ;
        }
    return answer;
    }
    public static int[] previouSmall(int []arr){
        int n = arr.length;
        int[] prevS = new int [n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!stk.isEmpty() && arr[stk.peek()] >= arr[i]){
                stk.pop();
            }
            prevS[i] = !stk.isEmpty()?stk.peek():-1;
        stk.push(i);
        }
    return prevS;
    }

    public static int[] nextSmall(int []arr){
        int n = arr.length;
        int[] nextS = new int [n];   
        Stack<Integer> stk = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){
        while(!stk.isEmpty() && arr[stk.peek()] > arr[i]){
            stk.pop();
        }
        nextS[i] = !stk.isEmpty()?stk.peek():n;
        stk.push(i);                    
        }
    return nextS;
    }


    public static int[] nextGreat(int []arr){
        int n = arr.length;
        int[] nextS = new int [n];   
        Stack<Integer> stk = new Stack<>();

        for(int i = n-1 ; i >= 0 ; i--){
        while(!stk.isEmpty() && arr[stk.peek()] < arr[i]){
            stk.pop();
        }
        nextS[i] = !stk.isEmpty()?stk.peek():n;
        stk.push(i);                    
        }
    return nextS;
    }
   public static int[] previouGreat(int []arr){
        int n = arr.length;
        int[] prevS = new int [n];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0 ; i < n ; i++){
            while(!stk.isEmpty() && arr[stk.peek()] <= arr[i]){
                stk.pop();
            }
            prevS[i] = !stk.isEmpty()?stk.peek():-1;
        stk.push(i);
        }
    return prevS;
    }
    
    public static long sumSubarrayMaxs(int[] arr) {
        long answer = 0;
        int n = arr.length;
        int[] prev = previouGreat(arr);
        int[] next = nextGreat(arr);
        long leftChoice,rightChoice;

        for(int i = 0 ; i < arr.length ; i++){
            leftChoice = i - prev[i];
            rightChoice = next[i] - i;
            long total = (long)(((leftChoice*rightChoice))*arr[i]);
            answer = (answer + total) ;
        }
    return answer;
    }    
}