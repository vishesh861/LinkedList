package arrays;

import java.util.Stack;

public class find132pattern {

    public boolean find132pattern(int[] nums) {

        int numsk = Integer.MIN_VALUE;

        Stack<Integer> st = new Stack();

        for(int idx = nums.length-1;idx>=0;idx--){

            if(nums[idx]<numsk) {
                return true;
            }
            while(!st.isEmpty()&&nums[idx]>st.peek()){
                numsk = st.pop();
            }

            st.push(nums[idx]);
        }
        return false;
    }
}
