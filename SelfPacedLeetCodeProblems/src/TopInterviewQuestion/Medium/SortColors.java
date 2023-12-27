package TopInterviewQuestion.Medium;

/*
75. Sort Colors
       _________________________________________________________________________________________________
       |Given an array nums with n objects colored red, white, or blue,                                |
       |sort them in-place so that objects of the same color are adjacent,                             |
       |with the colors in the order red, white, and blue.                                             |
       |We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.|
       |You must solve this problem without using the library's sort function.                         |
       |_______________________________________________________________________________________________|
       _________________________________________________________________________________________________
       |Example 1:                          Example 2:                                                 |
       |Input: nums = [2,0,2,1,1,0]         Input: nums = [2,0,1]                                      |
       |Output:       [0,0,1,1,2,2]         Output:        [0,1,2]                                     |
       |_______________________________________________________________________________________________|
       _________________________________________________________________________________________________
       |Constraints:    n == nums.length  ||  1 <= n <= 300  || nums[i] is either 0, 1, or 2.          |
       |_______________________________________________________________________________________________|
        Follow up: Could you come up with a one-pass algorithm using only constant extra space?
*/

public class SortColors {

    public void sortColors(int[] nums) {

        int pointerZero = 0;
        int pointerOne = 0;
        int pointerTwo = nums.length-1;
        while(pointerOne<=pointerTwo){
            switch (nums[pointerOne]){
                case 0:
                    swap(pointerZero,pointerOne,nums);
                    pointerZero++;
                    pointerOne++;
                    break;
                case 1:
                    pointerOne++;
                    break;
                case 2:
                    swap(pointerOne,pointerTwo,nums);
                    pointerTwo--;
                    break;
            }

        }
    }

    private void swap(int pos1,int pos2,int[] nums){
        int temp = nums[pos1];
        nums[pos1] = nums[pos2];
        nums[pos2] = temp;
    }

}
