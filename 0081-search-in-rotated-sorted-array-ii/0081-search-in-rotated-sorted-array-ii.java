class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return true;
            }
            for(int i=0; i < nums.length;i++){
            if(nums[i] == target){
                return true;
            }
        }
            if(nums[left] <= nums[mid]){
                if(nums[left] <= target && target < nums[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(target <= nums[right] && nums[mid] < target){
                    left = mid+1;
                }else{
                    right = mid-1;
                }
            }
        }
        return false;
        
    
    }
}