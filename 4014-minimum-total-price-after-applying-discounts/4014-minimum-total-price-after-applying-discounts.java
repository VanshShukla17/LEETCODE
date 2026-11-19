class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);

        double ans = 0.00;
        int i = prices.length-1 ;
        int j = discounts.length-1 ;
        while(i >= 0 && j >= 0){
            double p = prices[i];
            double d = discounts[j];
            ans += (p * (100 - d)) / 100;
            i--;
            j--;
        }
        int size = prices.length - discounts.length;
        if(size<=0){
            return ans;
        }
        else{
            for(i = 0 ; i < size ; i++){
                ans+=prices[i];
            }
        }
    return ans;
    }
}