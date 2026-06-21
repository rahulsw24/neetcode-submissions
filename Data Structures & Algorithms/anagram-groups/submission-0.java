class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap<>();
        for(String s : strs){
            // find key
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray); //eat -> a,e,t
            String sortedS = new String(charArray); // -> "aet"
            res.putIfAbsent(sortedS,new ArrayList<>()); // [aet] : []
            res.get(sortedS).add(s);

            
        }
        return new ArrayList<>(res.values());

        
    }
}
