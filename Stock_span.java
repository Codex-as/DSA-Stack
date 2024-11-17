//here we use nearest previous greater element logic 
class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
       int n = arr.length ;
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0 ; i < n ; i++) {
            
             while(!st.isEmpty() && arr[i] >= arr[st.peek()]) {
                 st.pop() ;
             }
             
             if(st.isEmpty()) {
                  ans.add(i+1);
             }
             else {
                 ans.add(i - st.peek()) ;
             }
             st.push(i);
            
        }
        return ans ; 
        
    }
}
