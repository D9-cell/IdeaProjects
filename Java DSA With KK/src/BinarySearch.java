public class BinarySearch {
    public static void main(String[] args) {
        //int[] nums ;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("The Size of Array : ");
//        int size = sc.nextInt();
//        nums = new int[size];
//        getValue(nums);
//        printValue(nums);
//        int grid[][] = {
//                { 4,3,2,-1},
//                {3,2,1,-1},
//                {1,1,-1,-2},
//                {-1,-1,-2,-3},
//                { 4,3,1,-1}
//        };
//        System.out.println(grid[0].length);
//        System.out.println(countNegatives(grid));
        int nums[] = {1,2,4,7,9,13,18,21,27};
        System.out.println(floorValue(nums,13));
    }

    private static boolean binarySearch(int nums[], int target){

        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }

    private static int ceiling(int nums[],int target){
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
           if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }

    private static int floorValue(int[] nums,int target){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return end;
    }

    public char nextGreatestCharacter(char[] letters,char target){
        int start = 0;
        int end = letters.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(letters[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }

    public int[] searchRange(int[] nums, int target) {
        int answer[] = {-1,-1};
        answer[0] = search(nums,target,true);
        if(answer[0] != -1){
            answer[1] = search(nums,target,false);
        }
        return answer;
    }

    private int search(int[] nums,int target,boolean isFirstIndex){
        int answer = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target<nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                answer = mid;
                if(isFirstIndex){
                    end = mid -1;
                }else{
                    start = mid +1;
                }
            }
        }
        return answer;
    }

    private int binarySearchInInfiniteArray(int[] nums,int target){
        //First find the range
        //First start with a box of Size 2
        int start = 0;
        int end = 1;
        //Condition for the target to lie in the range
        while(target>nums[end]){
            int temp = end + 1;//This is My new Start
            //Double the box value
            // end = previous end + sizeOfBox * 2
            end = end + (end - start +1)*2;
            start = end + 1;
        }
        return binarySearch(nums,target,start,end);
    }

    private int binarySearch(int[] nums, int target,int start,int end){
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

    private int peakIndexInMountainArray(int nums[]){
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            int mid = start + (end - start)/2;
            if(nums[mid]>nums[mid+1]){
                //You are in decreasing part of the array,this may be the answer but look at the left array also
                end = mid;
            }else{
                //You are in ascending part of the array
                //Because we know that mid+1 element > mid element
                start = mid +1;
            }
        }
        //In the end start == end and pointing to the largest number because of the two checks above
        return start;
    }



}
