class Solution {
    public boolean isPalindrome(String s) {
        s = s.trim();
        String s1 = s.toLowerCase();
        String s3 = s1.replaceAll("[^a-zA-Z0-9]", "");
        String s2 = s3.replace(" ","");

        int i  = 0 ; 
        int j = s2.length()-1;

        while(i<j){
            if(s2.charAt(i) != s2.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
    return true;
    }
}