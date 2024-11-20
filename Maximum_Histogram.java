class Solution {
    // Function to find largest rectangular area possible in a given histogram.
    public static long[] NSL(long[] hist) {
        long res[] = new long[hist.length] ;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < hist.length ; i++){
            while(!st.isEmpty() && hist[st.peek()] >= hist[i]) {
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = -1 ;
            }
            else  {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public static long[] NSR(long[] hist) {
        long res[] = new long[hist.length];
        Stack<Integer> st = new Stack<>();
        
        for(int i = hist.length - 1 ; i >= 0 ; i--){
            while(!st.isEmpty() && hist[st.peek()] >= hist[i]){
                st.pop();
            }
            if(st.isEmpty()) {
                res[i] = hist.length ;
            }
            else  {
                res[i] = st.peek();
            }
            st.push(i);
        }
        return res;
    }
    
    public static long getMaxArea(long hist[]) {
        // your code here
        long max = 0;
        long ans[] = new long[hist.length];
        long[] nsl = NSL(hist);
        long[] nsr = NSR(hist);
        for (int i = 0; i < hist.length; i++) {
            long width = nsr[i] - nsl[i] - 1; // Width of the rectangle
            long area = hist[i] * width; // Area calculation
            max = Math.max(max, area);// Update max area
        }
        return max ;
    }
}
