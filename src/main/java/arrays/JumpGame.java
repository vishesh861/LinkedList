package arrays;

//You are given an integer array nums. You are initially positioned at the array's first index,
// and each element in the array represents your maximum jump length at that position.
public class JumpGame {

    public boolean canJump(int[] nums) {
        int max = 0;
        int length = nums.length;

        for(int i = 0; i < length; i++){
            if( i > max){
                return false;
            }

            max = Math.max(max, i + nums[i]);
            if(max >= length - 1){
                return true;
            }
        }
        return false;
    }
}
