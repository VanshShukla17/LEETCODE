class Solution {
    public int[] findArray(int[] pref) {
        int xor=pref[0];
        int orginal = 0;
        for(int i=1;i<pref.length;i++){
            orginal = pref[i];
            pref[i] = pref[i]^xor;
            xor = orginal;
        }
    return pref;
    }
}