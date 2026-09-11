class Solution {
    public int minSubarray(int[] nums, int p) {
        long total = 0;
        for(int num :nums){
            total += num;
            }
        long rem = total%p;
        if(rem == 0){
            return 0;
        }
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(0L,-1);
        long prefix = 0;
        int minLength = nums.length;
        for(int i=0; i < nums.length;i++){
            prefix += nums[i];
            long currentRem = prefix%p;
            long need = (currentRem -rem +p)%p;
            if(map.containsKey(need)){
                int length = i-map.get(need);
                minLength = Math.min(minLength,length);
            }
            map.put(currentRem,i);
        }
        if(minLength  == nums.length){
            return -1;
        }
        return minLength;
}
}