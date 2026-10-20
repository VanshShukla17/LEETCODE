class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character , Integer > map = new HashMap<>();

        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(map.get(c) == null || map.get(c) == 0){
                count++;
            }
            else{
                map.put(c , map.get(c) - 1);
            }
        }
    return count;
    }
}