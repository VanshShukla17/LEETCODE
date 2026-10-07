class Solution {
    public int differenceOfSums(int n, int m) {
        int var1 = 0;
        int var2 = 0;
        for(int i = 1 ; i<=n ; i++){
            if(i%m!=0){
                var1+=i;
            }
            else{
                var2+=i;
            }
        }
    return var1-var2;
    }
}