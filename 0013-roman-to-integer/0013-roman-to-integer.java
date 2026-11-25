class Solution {
    public int romanToInt(String s) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int j = 2 ;
        int ans = 0;
        char prev = s.charAt(s.length()-1);
        for(int i = s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            if(map.get(ch) < map.get(prev)){
                ans -= map.get(ch);
            }
            else {
                ans += map.get(ch);
            }
        prev = ch;
        }
    return ans;
    }
}