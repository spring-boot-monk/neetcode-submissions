class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, LinkedList<String>> hMap = new HashMap<>();
        for(String s: strs){
            int charArray[] = new int[26];
            for(char ch: s.toCharArray()){
                charArray[ch-97]+=1;
            }
            String key = Arrays.toString(charArray);
            System.out.println(key);
            if(hMap.containsKey(key)){
                hMap.get(key).add(s);
            }else{
                hMap.put(key, new LinkedList<>(Arrays.asList(s)));
            }
        }
        return  hMap.values()
                               .stream()
                               .map(list -> (List<String>) list)
                               .toList();
    }
}
