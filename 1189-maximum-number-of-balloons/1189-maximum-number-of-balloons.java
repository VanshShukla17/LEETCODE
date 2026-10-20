class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        map.put('b', map.getOrDefault('b', 0)); 
        map.put('a', map.getOrDefault('a', 0));
        map.put('l', map.getOrDefault('l', 0));
        map.put('o', map.getOrDefault('o', 0));
        map.put('n', map.getOrDefault('n', 0)); 
        int count = 0;
        while(true){
            if(map.get('b')>=1 && map.get('a')>=1 && map.get('l')>=2 && map.get('o')>=2 && map.get('n')>=1){
                map.put('b',map.get('b')-1);  
                map.put('a',map.get('a')-1);  
                map.put('l',map.get('l')-2);  
                map.put('o',map.get('o')-2);  
                map.put('n',map.get('n')-1);  
                count++;
            }
            else{
                return count;
            }
        }
    }
}