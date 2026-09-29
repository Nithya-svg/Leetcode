class Solution {
    public int longestConsecutive(int[] nums) {
       int max = 0;
       HashSet<Integer> set = new HashSet<>();

       for(int i :nums){
        set.add(i);
       }
       for(int i:set){

       
       if(!set.contains(i-1)){
        int current = i;
        int length = 1;
        while(set.contains(current+1)){
            length++;
            current++;
        }
        max = Math.max(max,length);
       }
       }
        return max;

            
        
    }
}