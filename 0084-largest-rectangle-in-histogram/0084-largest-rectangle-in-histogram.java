class Solution {
    public int largestRectangleArea(int[] heights) {
        
            Stack<Integer> st = new Stack<>();
            int maxarea = 0;
            for(int i=0; i <= heights.length;i++){
                int currentval = (i==heights.length)?0:heights[i];
                while(st.size() > 0&& heights[st.peek()] > currentval){
                    int removeindex = st.pop();
                    int height = heights[removeindex];
                    int width;
                    if(st.size() == 0){
                        width = i;
                    }
                    else{
                        width = i-st.peek()-1;
                    }
                    int area = height*width;
                    if(area > maxarea){
                        maxarea = area;
                    }
                }
                st.push(i);
            }
            return maxarea;
        
        }
    }
