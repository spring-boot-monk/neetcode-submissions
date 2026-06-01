class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
            return false;

        int[] countArr = new int [26];
        s = s.toLowerCase();
        t = t.toLowerCase();
        for(char ch: s.toCharArray()){
            countArr[ch-97]++;
        }
        for(char ch: t.toCharArray()){
            countArr[ch-97]--;
        }
        for(int i: countArr){
            if(i>=1){
                return false;
            }
        }
        return true;
    }
}
