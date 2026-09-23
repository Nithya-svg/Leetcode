class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close = nums[0]+nums[1]+nums[2];
        for(int first=0; first < nums.length-2;first++){

            int second = first+1;
            int third = nums.length-1;
            while(second < third){
                int sum = nums[first]+nums[second]+nums[third];
                if(Math.abs(close - target) > Math.abs(sum-target)){
                    close = sum;
                }
                if(sum == target){
                    return sum;
                }
                else if(sum < target){
                    second++;
                }
                else{
                    third--;
                }
            }
        }
        return close;

    }
}