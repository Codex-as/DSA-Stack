class Solution {
    // Function to find the next greater element for each element of the array.
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
         int n = arr.length ;
        for(int i = n-1 ; i >= 0 ; i--){
           while(!stack.isEmpty() && arr[i] >= stack.peek()) {
               stack.pop();
           }
           if(stack.isEmpty()) {
               ans.add(-1);
               stack.push(arr[i]) ;
           }
           else if(arr[i] < stack.peek()) {
               ans.add(stack.peek()) ;
               stack.push(arr[i]);
           }
             
        }
      Collections.reverse(ans); 
      return ans ;
    }
}
