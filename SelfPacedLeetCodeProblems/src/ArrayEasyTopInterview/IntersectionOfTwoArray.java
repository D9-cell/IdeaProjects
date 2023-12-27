package ArrayEasyTopInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class IntersectionOfTwoArray {

    public static void main(String[] args) {
        //Example 1
        int[] nums1={1,2,2,1};
        int[] nums2 = {2,2};
        int[] result = intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
        /*
        int[] nums1={4,9,5};
        int[] nums2 = {9,4,9,8,4};
        * */
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int resultLength = Math.min(nums1.length, nums2.length);
        int[] result = new int[resultLength];
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            int current = nums1[i];
            if(!map.containsKey(current)){
                map.put(current,1);
            }else{
                map.put(nums1[i],map.get(current)+1 );
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            int curr = nums2[i];
            if(map.containsKey(curr) && map.get(curr)>0){
                list.add(curr);
                map.put(curr,map.get(curr)-1);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        //result = list.stream().mapToInt(i -> i).toArray();
        return result;
    }
}
