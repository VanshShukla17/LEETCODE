class Solution {
    public int maxProduct(int n) {
        int largest=0;
        int second=0;
        while(n>0){
            if(n%10>largest){
                second=largest;
                largest=n%10;
                n=n/10;
            }
            else if(n%10 > second){
                second = n%10;
                n=n/10;
            }
            else{
                n=n/10;
            }
        }
    return largest*second;
    }
}