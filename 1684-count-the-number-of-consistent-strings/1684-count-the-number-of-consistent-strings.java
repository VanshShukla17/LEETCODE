class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        int count=0;
        for(String word:words){
            int have = 1;// bhai mtlb pehle se maan liya hai word consistent hai
            for(int i=0;i<word.length();i++){
                if(!set.contains(word.charAt(i))) {
                    have = 0;// agar koi bhi letter nhi present hua to ye zero
                    break;
                }
            }
            count+=have;// ye addition pura word check hone ke baad hoga
        }
        return count;
    }
}