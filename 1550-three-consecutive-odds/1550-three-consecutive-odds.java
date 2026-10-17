class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int check = 3;
        int count = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]%2!=0){
                count++;
            }
            else{
                count = 0;
            }
        if(count==check){
            return true;
        }
        }
    return false;
    }
}