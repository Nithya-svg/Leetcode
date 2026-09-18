class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
	    int maxsum= 0;
        int minsum = 0;
        int total = 0;
	for(int i=0; i < nums.length;i++){
        total += nums[i];
	    if(maxsum +nums[i]  > nums[i]){
            maxsum += nums[i];
        }
	    else{
	        maxsum = nums[i];
	    }
	    	max = Math.max(max,maxsum);
	
    
	    if(minsum+nums[i]  < nums[i]){
            minsum += nums[i];
        }
	    else{
	        minsum = nums[i];
	    }
        min = Math.min(min,minsum);
    }
	    if(max < 0){
            return max;
        }
    
        return Math.max(max,total-min);
	}

	
    }

