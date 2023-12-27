package TopInterviewQuestion.Hard;

import java.util.*;

/*315. Count of Smaller Numbers After Self
       ___________________________________________________________________________
       |Given an integer array nums,return an integer array counts                |
       |where counts[i] is the number of smaller elements to the right of nums[i].|
       |__________________________________________________________________________|
       |Example 1:                                                                |
       |Input: nums = [5,2,6,1]                                                   |
       |Output: [2,1,1,0]                                                         |
       |Explanation:                                                              |
       |To the right of 5 there are 2 smaller elements (2 and 1).                 |
       |To the right of 2 there is only 1 smaller element (1).                    |
       |To the right of 6 there is 1 smaller element (1).                         |
       |To the right of 1 there is 0 smaller element.                             |
       |                                                                          |
       |Example 2:               |            Example 3:                          |
       |Input: nums = [-1]       |            Input: nums = [-1,-1]               |
       |Output: [0]              |            Output: [0,0]                       |
       |_________________________|________________________________________________|
       |Constraints:                                                              |
       |1 <= nums.length <= 105                                                   |
       |-104 <= nums[i] <= 104                                                    |
       |__________________________________________________________________________| */

public class CountOfSmallerNumberAfterSelf {

    public List<Integer> countSmaller(int[] nums) {
      int n = nums.length;
      int[] counts = new int[n];
      counts[n-1] = 0;
        for (int i = n-2; i >= 0 ; i--) {
            int curr = nums[i];
            int lp = i+1;
            int rp = n-1;
            int smallerCounts = 0;
            while(lp != rp){
                if(nums[lp]<curr){
                    lp++;
                    smallerCounts++;
                }if(nums[rp]<curr){
                    rp--;
                    smallerCounts++;
                }
            }
            if(nums[lp] < nums[i]){
                smallerCounts++;
            }
            counts[i] = smallerCounts;
        }
        List<Integer> list = new ArrayList<>();
        for (int i:counts) {
            list.add(i);
        }
        return list;
    }



}
