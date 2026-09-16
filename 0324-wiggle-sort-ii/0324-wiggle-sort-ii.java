class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n= nums.length;
        int mid = (n+1)/2;
        int left = mid-1;
        int right = n-1;
        int[] result = new int[n];
        for(int i=0; i < nums.length;i++){
            if(i%2 == 0)
            {
                result[i] = nums[left];
                left--;
            }
            
            else{
                result[i] = nums[right];
                right--;
            }
        }
        for(int i=0; i < n;i++){
              nums[i] = result[i];
        }
    
    }
}