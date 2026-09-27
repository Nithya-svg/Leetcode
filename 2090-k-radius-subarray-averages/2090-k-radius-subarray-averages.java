class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] avg = new int[nums.length];
        int n= nums.length;
        Arrays.fill(avg,-1);
        int window = 2*k +1;
        if(window > n){
            return avg;
        }
        long sum = 0;
       
        for(int i=0; i < window;i++){
            sum += nums[i];
        }
        avg[k] = (int)(sum/window);

        for(int i = k+1; i < n-k;i++){
            sum -= nums[i-k-1];
            sum += nums[i+k];
            avg[i] = (int)(sum/window);
                    
        }
        return avg;
    }
}