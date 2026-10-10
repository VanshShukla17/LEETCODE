class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
    public static int reverse(int n){
        int rev = 0;
        int i = (int)Math.log10(n);
        while(n>0){
        rev+=(n%10)*Math.pow(10,i);
        i--;
        n=n/10;
            
        }
    return rev;
    }
}