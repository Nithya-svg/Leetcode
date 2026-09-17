class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
       int[] result = new int[temperatures.length];
        for(int i=0; i < temperatures.length;i++){
            while(stack.size() > 0 && temperatures[i] > temperatures[stack.peek()]){
                int removeindex = stack.pop();
                result[removeindex] = i- removeindex;
            }
            stack.push(i);
    }
    return result;
}
}