package TopInterviewQuestion.Medium;

/*
287. Find the Duplicate Number
       ________________________________________________________________________________________________|
       |Given an array of integers nums containing n + 1 integers where                                |
       |each integer is in the range [1, n] inclusive.                                                 |
       |There is only one repeated number in nums, return this repeated number.                        |
       |                                                                                               |
       |You must solve the problem without modifying the array nums and uses only constant extra space.|
       |_______________________________________________________________________________________________|
       | Example 1:                  |  Example 2:                                                     |
       | Input: nums = [1,3,4,2,2]   |  Input: nums = [3,1,3,4,2]                                      |
       | Output: 2                   |  Output: 3                                                      |
       |_______________________________________________________________________________________________|
       |Constraints:                                                                                   |
       |1 <= n <= 105    |     nums.length == n + 1   |     1 <= nums[i] <= n                          |
       |_______________________________________________________________________________________________|
       |All the integers in nums appear only once except for precisely one integer which               |
       |appears two or more times.                                                                     |
       |                                                                                               |
       |Follow up:                                                                                     |
       |How can we prove that at least one duplicate number must exist in nums?                        |
       |Can you solve the problem in linear runtime complexity?                                        |
       |_______________________________________________________________________________________________|
*/

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,3,2,2,2};
        arr[0]++;
        System.out.println(arr[0]);
    }

    public int findDuplicate(int[] nums) {
      int[] result = new int[nums.length];
      result[0] = 1;
      int duplicate = 0;
        for (int num : nums) {
            result[num]++;
            if(result[num]>1){
                duplicate = num;
            }
        }
        return duplicate;
    }
}
