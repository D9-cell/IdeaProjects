public class RotatedArray {

    public static void main(String[] args) {
        int[] nums= {4,5,6,8,0,1,2};
        int[] nums1 = {7,8,9,2,3};
        System.out.println(countRotation(nums));

    }

    private static int countRotation(int[] nums) {
        int pivot = findPivot(nums);
        return pivot+1;
    }


    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        //We didn't find a pivot that means the array is not rotated
        if(pivot == -1){
            binarySearch(nums,target,0, nums.length-1);
        }
        //if pivot is found
        if(target == nums[pivot]){
            return pivot+1;
        }
        if(target >= nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }

        return binarySearch(nums,target,pivot+1, nums.length-1);
    }

    private static int binarySearch(int[] nums, int target,int start,int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }else if(target>nums[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    private static int findPivot(int[] nums){

        int start = 0;
        int end = nums.length -1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }

            if(nums[start]>nums[mid]){
                end = mid - 1;
            }else{
                start = mid;
            }
        }

        return -1;
    }

    private static int findPivotWithDuplicates(int[] nums){

        int start = 0;
        int end = nums.length - 1;
        while(start<=end){

            int mid = start + (end-start)/2;
            if(mid < end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end] ){
                //Check if start is pivot before ignore the start
                if(nums[start] > nums[start+1]){
                    return start;
                }
                start++;

                //Check if end is pivot before ignore the end
                if(nums[end]<nums[end-1]){
                    return end-1;
                }
                end--;
            }
            //Left side is sorted so check on the right side
            else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end])){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }

        return -1;
    }

}
