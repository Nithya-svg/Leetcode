class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int count = 0;
        double average = 0;
         
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
            average = (double)sum/k;
            if(average >= threshold){
                count++;
            
        }
     
      
       
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i-k];
            average = (double) sum / k;
            if(average >= threshold){
                count++;
            }
    }
                
            return count;
    }

}