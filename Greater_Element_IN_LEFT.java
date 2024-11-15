class Solution {
      public ArrayList<Integer> previousLargerElement(int[] arr) {
          int n = arr.length ;
          Stack<Integer> st = new Stack<>();
         ArrayList<Integer> ans = new ArrayList<>();
         
           for(int i = 0 ; i < n ; i++) {
                if(st.isEmpty()) {
                    ans.add(-1);
                    st.push(arr[i]);
                }
              else if(!st.isEmpty() && arr[i] < st.peek()) {
                  ans.add(st.peek());
                  st.push(arr[i]);
              }
             while(!st.isEmpty() && arr[i] >= st.peek()) {
                 st.pop() ;
             }
             return ans ;
             
      }
}
