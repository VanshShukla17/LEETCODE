class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++) {
            char ch = order.charAt(i);
            if(map.containsKey(ch)) {
                int freq = map.get(ch);
                for(int j = 0; j < freq; j++) {
                    sb.append(ch);
                }
                map.remove(ch);
            }
        }
        for(char ch : map.keySet()) {
            int freq = map.get(ch);

            for(int j = 0; j < freq; j++) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}