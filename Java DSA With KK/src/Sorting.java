public class Sorting {


    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,-1};

    }
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            boolean isSwapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if(nums[j] < nums[j-1]){
                    swap(nums,j,j-1);
                    isSwapped = true;
                }
            }
            //It is checked here because if in any value for i if swap function is not worked then the array is in sorted position
            if(!isSwapped){
                break;
            }
        }
    }

    private static void swap(int[] array,int i,int j ){
        int temp = array[i];;
        array[i] = array[j];
        array[j] = temp;
    }

}
