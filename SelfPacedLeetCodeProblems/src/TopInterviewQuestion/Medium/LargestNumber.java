package TopInterviewQuestion.Medium;
import java.util.Arrays;

/*
179.Largest Number
    _____________________________________________________________________________________________________
    |Given a list of non-negative integers nums, arrange them such that they form the largest number and|
    |return it.Since the result may be very large, so you need to return a string instead of an integer.|
    |___________________________________________________________________________________________________|
    |Example 1:              |   Example 2:                     |    Constraints:                       |
    |Input: nums = [10,2]    |   Input: nums = [3,30,34,5,9]    |    1 <= nums.length <= 100            |
    |Output: "210"           |   Output: "9534330"              |    0 <= nums[i] <= 10^9               |
    |________________________|__________________________________|_______________________________________|

*/
public class LargestNumber {

    public String largestNumber(int[] nums) {
       String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
        StringBuilder sb = new StringBuilder();
        for (String str :s){
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0")? "0":result;
    }
    private int firstDigit(int n){
        int digits = (int)Math.log10(n);
        n = (int)(n/(int)Math.pow(10,digits));
        return n;
    }

}
/*
[3,30,34,5,9] -
[9] , [5] , [34,30,3]
33430
34330
*/