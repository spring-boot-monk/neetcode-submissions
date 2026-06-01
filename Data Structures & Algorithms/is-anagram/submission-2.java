class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        s = s.toLowerCase();
        t = t.toLowerCase();
        int[] arr = new int[26];

        for(char ch: s.toCharArray()){
            arr[ch - 97]++;
        }
        for(char ch: t.toCharArray()){
            arr[ch - 97]--;
        }
        return !Arrays.stream(arr).anyMatch(num -> num > 0);
    }
}
