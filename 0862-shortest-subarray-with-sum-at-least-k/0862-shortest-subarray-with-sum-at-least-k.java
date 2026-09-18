class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n= nums.length;
        long[] prefix = new long[n+1];
        for(int i=0;i < n;i++){
            prefix[i+1] = prefix[i] + nums[i];

        }
        Deque<Integer> deque = new ArrayDeque<>();
        int minlen= n+1;
        for(int i=0; i <= n;i++){
            while(!deque.isEmpty() && prefix[i] - prefix[deque.peekFirst()] >= k){
                int curr_len = i- deque.pollFirst();
                minlen = Math.min(minlen,curr_len);
            }
            while(!deque.isEmpty() && prefix[deque.peekLast()] >= prefix[i]){
                deque.pollLast();

            }
            deque.offerLast(i);
        }
        return minlen == n + 1 ? -1 : minlen;
    }
}