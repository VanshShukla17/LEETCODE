class Solution {
    public boolean isSameAfterReversals(int num) {

        if(num<10){
            return true;
        }
        return reverse(num);
    }

    public static boolean reverse(int num){
        if(num%10==0){
            return false;
        }
    return true;
    }
}