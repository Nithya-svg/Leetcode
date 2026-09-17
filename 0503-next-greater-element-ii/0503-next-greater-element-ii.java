class Solution {
    public int[] nextGreaterElements(int[] nums) {
         Stack<Integer> stack = new Stack<>();
         int n = nums.length;
         int[] result = new int[nums.length];
        for(int i=0; i < 2*n-1;i++){
             int index = i%n;
            while(stack.size() > 0 && nums[index] > nums[stack.peek()]){
                int removeindex = stack.pop();
                result[removeindex] = nums[index];
                
            
            
        }
        if(i < n){
            stack.push(i);
        }
            
    }
    while(stack.size() >0){
        int removeindex = stack.pop();
        result[removeindex] = -1;
    }
    return result;

    }
}