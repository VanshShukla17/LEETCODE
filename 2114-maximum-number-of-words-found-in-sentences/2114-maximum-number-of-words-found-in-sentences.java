class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0 ; i<sentences.length; i++){
            String str=sentences[i];
            int len=str.length();
            String str2 = str.replace(" ","");
            int len2= str2.length();
            int words=len-len2+1;
            if(words>max){
                max=words;
            }
        }
    return max;
    }
}