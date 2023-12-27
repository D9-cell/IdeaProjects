package TopInterviewQuestion.Medium;
/*
55. Jump Game
        You are given an integer array nums. You are initially positioned at the array's first index,
        and each element in the array represents your maximum jump length at that position.

        Return true if you can reach the last index, or false otherwise.
        Example 1:

        Input: nums = [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
        Example 2:

        Input: nums = [3,2,1,0,4]
        Output: false
        Explanation: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

        Constraints:
        1 <= nums.length <= 10^4
        0 <= nums[i] <= 10^5
*/
public class JumpGame {

    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }

    public boolean canJumpOptimalApproach(int[] nums) {
        int lastTrueIndex = nums.length-1;
        for(int i=nums.length-1 ; i >= 0 ; i--){
            if(i + nums[i] >= lastTrueIndex){
                lastTrueIndex = i;
            }
        }
        return lastTrueIndex == 0;
    }

    //My Approach - runtime = 83ms in leetcode
    public boolean canJump(int[] nums) {

        if(nums.length <= 1){
            return true;
        }
        boolean[] result = new boolean[nums.length];
        int n = result.length;
        result[n-1] = true;

        for (int i = n-2 ; i >= 0; i--) {
            if(nums[i]==0){
                result[i] = false;
            }else{
                int  j = 1;
                while(j <= nums[i]){
                    if(result[i + j]){
                        result[i] = true;
                        break;
                    }
                    j++;
                }
            }
        }
        return result[0];
    }
}
