class Solution {
    public String largestOddNumber(String num) {
        StringBuilder s1 = new StringBuilder();
        for(int i = num.length()-1;i>=0;i--){
            char ch = num.charAt(i);
            int num1 = ch - '0';
            if(num1 % 2 !=0){
                s1.append(String.valueOf(num1));
            }
            else{
                if(s1.isEmpty()){
                    continue;
                }
                else{
                s1.append(String.valueOf(num1));
                }
            }
        }
    return s1.reverse().toString();
    }
}