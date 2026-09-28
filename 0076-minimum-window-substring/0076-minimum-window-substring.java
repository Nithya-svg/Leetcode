class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map1 = new HashMap<>();
        int left = 0;
        int right = 0;
        int have = 0;
        
        int min = Integer.MAX_VALUE;
        int start = 0;

        for (char c : t.toCharArray()) {
              map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
            
            
        while(right < s.length()){
            char c = s.charAt(right);
            map.put(c,map.getOrDefault(c,0)+1);
                
            if(map1.containsKey(c) && map.get(c).intValue() == map1.get(c).intValue()){
                have++;
            }
            int needcount = map1.size();
            while(have == needcount ){
                if(right -left+1 < min){
                    min = right-left +1;
                    start = left;
             }
                char remove = s.charAt(left);
                map.put(remove,map.get(remove)-1);
                if(map1.containsKey(remove) && map.get(remove) < map1.get(remove)){
                    have--;
                }
                left++;
            }
            right++;
                }
        if(min == Integer.MAX_VALUE){
            return "";
        }
        return s.substring(start,start+min);
    }
}