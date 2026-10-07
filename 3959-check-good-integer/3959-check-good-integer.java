class Solution {
    public boolean checkGoodInteger(int n) {
        return (squareSum(n) - digitSum(n))>=50;
    }
    public static int digitSum(int n){
        int sum = 0;
        while(n>0){
            int last = n%10;
            sum += last;
            n  = n/10;
        }
    return sum;
    }

    public static int squareSum(int n){
        int sum2 = 0;
        while(n>0){
            int last = n%10;
            sum2 += last*last;
            n  = n/10;
        }
    return sum2;
    }
}