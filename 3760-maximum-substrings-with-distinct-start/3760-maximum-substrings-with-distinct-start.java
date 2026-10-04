class Solution {
    public int maxDistinct(String s) {
        StringBuilder str = new StringBuilder();
        int count=0;
        for(int i = 0 ; i <s.length() ; i++){
            if(!str.toString().contains(String.valueOf(s.charAt(i)))){
                str.append(String.valueOf(s.charAt(i)));
                count++;
            }
        }
    return count;
    }
}