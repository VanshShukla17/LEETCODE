class Solution {
    public int digitFrequencyScore(int n) {
        int freq[] = new int[11];
        while(n>0){
            freq[n%10]++;
            n=n/10;
        }
        int sum=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0){
                continue;
            }
            else{
                sum+=freq[i]*i;
            }
        }
    return sum;
    }
}