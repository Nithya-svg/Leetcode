class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int w : weights){
            l = Math.max(w,l);
            r += w;
        }
        int res = r;
        while(l <= r){
        int cap= (l+r)/2;
            if (canship(weights,cap,days)){
                res = Math.min(res,cap);
                        
              r = cap-1;
            }
            else{
                l = cap+1;
            }
        }
        return res;
    }
    private boolean canship(int[] weights,int cap, int days){
        int ship = 1, current = cap;
        for(int w: weights){

        
        if(current -w<0){
            ship++;
            if(ship > days){
                return false;
            }
        
        current = cap;
    }
    current -= w;
        } 
        return true;
        
}
}