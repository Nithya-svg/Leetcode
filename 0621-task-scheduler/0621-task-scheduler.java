class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] = new int[26];
        int maxfreq = 0;
        for(int i=0; i < tasks.length;i++){
            freq[tasks[i]- 'A']++;
            if(freq[tasks[i] - 'A'] > maxfreq){
                maxfreq = freq[tasks[i] - 'A'];

            }
        }
        int maxcount = 0;
        for(int f:freq){
            if(f == maxfreq){
                maxcount++;
            }
        }
        int numpart = maxfreq-1;
        int perpart = n+1;
        int ans = numpart*perpart+maxcount;
        return Math.max(ans,tasks.length);
    }
}