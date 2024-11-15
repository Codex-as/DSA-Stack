class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextSmallerElement(int[] arr) {
            int n = arr.length ;
            Stack<Integer> st = new Stack<>();
           ArrayList<Integer> ans = new ArrayList<>();
           for(int i = n-1 ; i >= 0 ; i--) {
                 if(st.isEmpty()) {
                    ans.add(-1);
                   st.push(arr[i]);
                 }
              else if(!st.isEmpty() && st.peek() < arr[i]) {
                  ans.add(st.peek());
                  st.push(arr[i]);
              }
             while(!st.isEmpty() && arr[i] < st.peek()) {
                st.pop() ;
             }
           }
          Collections.reverse(ans) ;
           return ans;
    }
}
