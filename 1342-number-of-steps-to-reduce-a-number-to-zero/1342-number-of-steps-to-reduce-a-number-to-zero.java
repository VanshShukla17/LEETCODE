class Solution {
    public int numberOfSteps(int num) {
        return steps(num);
    }
    public static int steps(int n){
        return helper(n , 0);
    }
    static int helper(int n, int step){
        if(n==0){
            return step;
        }
        if(n%2==0){
            return helper(n/2,step+1);
        }
        else{
            --n;
            return helper(n,step+1);
        }
    }
}