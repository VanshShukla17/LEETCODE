class Solution {
    public int reverse(int x) {
        String s=Integer.toString(x);
        int i=0;
        int j=s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            if(s.charAt(i)=='-'){
                i++;
            }
            else{
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;  
            }
        }
        s = new String(arr);
        long num= Long.parseLong(s);

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
                return 0;
            }

        return (int) num;
    }
}