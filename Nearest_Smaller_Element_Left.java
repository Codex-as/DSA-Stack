class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length ;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++) {
            if(st.isEmpty()) {
                ans.add(-1);
               st.push(arr[i]) ;
        }
          else if(!st.isEmpty() && st.peek() < arr[i]) {
             ans.add(st.peek());
             st.push(arr[i]); 
          }
          while(!st.Empty() && st.peek() > arr[i]) {
             st.pop() ;
          }
          return ans ;
    }
}
