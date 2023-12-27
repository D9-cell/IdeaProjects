import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = {5,4,3,2,1,-1};
        Sorting.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    private void getValue(int nums[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input : ");
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
        }
    }

    private void printValue(int[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }
}