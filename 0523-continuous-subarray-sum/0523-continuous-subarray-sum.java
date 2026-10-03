class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        for(int i=0; i < nums.length;i++){
            sum += nums[i];
            int result = sum%k;
            if(result < 0){
                result += k;
            }
            
            if(map.containsKey(result)){
                int subarray  = i - map.get(result);
            
            if(subarray >= 2){
                return true;
            }
            }else{
         map.put(result,i);
            }
        
        }
        
        return false;
    }
}