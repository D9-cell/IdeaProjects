/*
152. Maximum Product Subarray
        Given an integer array nums, find a subarray
        that has the largest product, and return the product.

        The test cases are generated so that the answer will fit in a 32-bit integer.
        Example 1:

        Input: nums = [2,3,-2,4]
        Output: 6
        Explanation: [2,3] has the largest product 6.
        Example 2:

        Input: nums = [-2,0,-1]
        Output: 0
        Explanation: The result cannot be 2, because [-2,-1] is not a subarray.


        Constraints:

        1 <= nums.length <= 2 * 10^4
        -10 <= nums[i] <= 10
        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
*/
package TopInterviewQuestion.Medium;
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int i=0,j=nums.length-1;
        int max = 0;
        int leftPointer = 1;
        int rightPointer = 1;
        while(i< nums.length && j>= 0){
            leftPointer *= nums[i];
            rightPointer *= nums[j];
            max = Math.max(max,Math.max(leftPointer,rightPointer));
            if(leftPointer == 0){
                leftPointer = 1;
            }
            if(rightPointer == 0){
                rightPointer = 1;
            }
            i++;
            j--;
        }
        return max;
    }
}
