class Solution {
    public int maxProduct(int[] nums) {
        
        int result = nums[0];

        int productmin = nums[0];
        int productmax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currentval = nums[i];
            int oldmax = productmax;
            int oldmin = productmin;

            productmax = Math.max(
                currentval,
                Math.max(currentval * oldmax, currentval * oldmin)
            );

            productmin = Math.min(
                currentval,
                Math.min(currentval * oldmax, currentval * oldmin)
            );

            

            result = Math.max(result, Math.max(productmax,productmin));
        }

        return result;
    
    }
}