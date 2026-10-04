class Solution {
    public String convertToBase(int n, int base) {
        String s = "0123456789";
        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int rem = n % base;
            result.append(s.charAt(rem));
            n /= base;
        }
        return result.reverse().toString();
    }
    
    public boolean palindrome(String s) {
        int l = 0;
        int h = s.length() - 1;
        while (l <= h) {
            if (s.charAt(l) != s.charAt(h)) {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    
    public boolean isStrictlyPalindromic(int n) {
        for (int base = 2; base <= n - 2; base++) {
            String result = convertToBase(n, base);
            if (!palindrome(result)) return false;
        }
        return true;
    }
}