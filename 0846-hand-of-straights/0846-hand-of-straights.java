class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length%groupSize != 0){
            return false;
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i=0; i < hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }
        while(map.size() > 0){
            int first = map.firstKey();
            for(int i=0; i < groupSize;i++ ){
               int next = first+i;
               if(map.containsKey(next) == false){
                return false;
               }
               map.put(next,map.get(next)-1);
               if(map.get(next) == 0){
                map.remove(next);
               }
            }    

    }
    return true;
}
}