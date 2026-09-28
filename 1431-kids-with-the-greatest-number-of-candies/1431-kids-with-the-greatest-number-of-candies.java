class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int n = candies.length;
        int maxi =max(candies);
        for(int i = 0 ; i < n ; i++){
            if(candies[i] + extraCandies >= maxi){
                ls.add(true);
            }
            else{
                ls.add(false);
            }
        }
    return ls;
    }

    public int max(int[] arr){
        int max=arr[0];
        for( int i = 0 ; i < arr.length ; i++){
            if( max < arr[i]){
                max = arr[i];
            }
        }
    return max;
    }
}