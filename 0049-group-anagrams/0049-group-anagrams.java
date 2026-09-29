class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> ana = new HashMap<>();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted =  new String(ch);
            if(!ana.containsKey(sorted)){
                ana.put(sorted,new ArrayList<>());
            }
            ana.get(sorted).add(s);


        }
        return new ArrayList<>(ana.values());
       

            
        
    }
}