class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currentmax = 0;
        int currentmin =0;
        int answer = 0;
        for(int i=0; i < nums.length;i++){
            currentmax = Math.max(nums[i],currentmax+nums[i]);

        
            currentmin = Math.min(nums[i],currentmin+nums[i]);

        
        answer = Math.max(answer,Math.max(currentmax,Math.abs(currentmin)));
        }
        return answer;
        

}
}