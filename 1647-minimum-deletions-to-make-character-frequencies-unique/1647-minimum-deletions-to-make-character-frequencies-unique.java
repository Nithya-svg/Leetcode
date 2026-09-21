class Solution {
    public int minDeletions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i < s.length();i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        HashSet<Integer> set = new HashSet<>();
        int delcount = 0;
        for(Integer i: map.values()){
        while(i > 0 && set.contains(i)){
            i--;
            delcount++;
        }
        if(i > 0){
            set.add(i);
        }
        }
    return delcount;
       
    }
}