class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        for(int i=0; i < words.length;i++){
             map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        List<String> l = new ArrayList<>();
        for(String s:map.keySet()){
            l.add(s);
        }
        Collections.sort(l,(a,b)->{
            if(map.get(a) == map.get(b)){
                return a.compareTo(b);
            }
            else{
                return map.get(b)- map.get(a);
            }
        });
        return l.subList(0,k);
    }
}