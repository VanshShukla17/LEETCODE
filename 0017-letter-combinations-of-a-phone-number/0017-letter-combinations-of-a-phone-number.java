class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character,String> map=new HashMap<>();
        List<String> ls=new ArrayList<>();
        StringBuilder s=new StringBuilder();
        int n=digits.length();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    comb(map, ls , s, n , 0 ,digits);
    return ls;

    }

    public static void comb(HashMap<Character,String> map , List<String> ls, StringBuilder s, int n , int idx, String digits){
        if(idx==n){
            ls.add(s.toString());
            return;
        }
        String choice=map.get(digits.charAt(idx));
        for(int j=0 ; j<choice.length() ; j++){
            s.append(choice.charAt(j));
            comb(map , ls , s , n, idx+1 , digits);
            s.deleteCharAt(s.length()-1);
        }
    return;
    }
}