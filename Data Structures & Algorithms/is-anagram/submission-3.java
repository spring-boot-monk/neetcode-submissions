class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        if(s.length() != t.length())
            return false;

        for(int i = 0; i < s.length(); i++){
            hMap.put(s.charAt(i), hMap.getOrDefault(s.charAt(i), 0)+1);
            hMap.put(t.charAt(i), hMap.getOrDefault(t.charAt(i), 0)-1);
        }

        return !hMap.values().stream().anyMatch(v -> v != 0);
    }
}
