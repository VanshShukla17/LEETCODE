class Solution {
    public int maxFreqSum(String s) {
        char vfreq[] = new char[26];
        char cfreq[] = new char[26];
        for(int i=0;i<s.length() ; i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
            vfreq[s.charAt(i)-'a']++;
        }
        else{
            cfreq[s.charAt(i)-'a']++;
        }
    }
        int sum=0;
        int vowelMax=0;
        int consonantMax=0;
        for(int i=0;i<vfreq.length;i++){
            if(vowelMax<vfreq[i]){
                vowelMax=vfreq[i];
            }
        }
        for(int i=0;i<cfreq.length;i++){
            if(consonantMax<cfreq[i]){
                consonantMax=cfreq[i];
            }
        }

    return consonantMax+vowelMax;
    }
}