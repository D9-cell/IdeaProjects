import java.util.ArrayList;
import java.util.Arrays;

public class RecursionArray {

    static boolean isSorted(int[] arr,int index){
        //Base Condition
        if(index == arr.length-1){
            return true;
        }
        return (arr[index] < arr[index+1]) && isSorted(arr, index+1);
    }
    //Follow this below approach
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        return findAllIndex(arr,target,index+1,list);
    }
    //Dont follow below approach
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(target == arr[index]){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    static int rotatedBinarySearch(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target == arr[mid]){
            return mid;
        }
        if(arr[start]<= arr[mid]){
            if (arr[start] <= target && arr[mid] >= target) {
                return  rotatedBinarySearch(arr,target,start,mid-1);
            }else{
                return rotatedBinarySearch(arr,target,mid+1,end);
            }
        }
        if(target >= arr[mid] && target <= arr[end]){
            return  rotatedBinarySearch(arr,target,mid+1,end);
        }
        return  rotatedBinarySearch(arr,target,start,mid-1);
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));;

        return merge(left,right);
    }

    private static int[] merge(int[] first,int[] second){
         int[] mix = new int[first.length + second.length];
         int i=0,j=0,k=0;
         while(i < first.length && j < second.length){
             if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
             }else{
                 mix[k] = second[j];
                 j++;
             }
             k++;
         }
         while(i < first.length){
             mix[k] = first[i];
             i++;
             k++;
         }
         while(j < second.length){
             mix[k] = second[j];
             j++;
             k++;
         }
         return mix;
    }

    public static void mergeSortInPlace(int[] arr,int start,int end){
        if(end - start == 1){
            return;
        }
        int mid = start + (end - start)/2;

        mergeSortInPlace(arr, start, mid);
        mergeSortInPlace(arr,mid,end);

        mergeInPlace(arr,start,mid,end);
    }

    private static void mergeInPlace(int[] arr,int start,int mid,int end){

        int[] mix = new int[end - start];
        int i=start,j=mid,k=0;
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }

    public static void quickSort(int[] arr,int low,int high){
        if(low >= high){
            return;
        }
        int start = low;
        int end = high;
        int mid = start + (end - start)/2;

        int pivot = arr[mid];
        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,start,high);
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        int[] duplicateArr = {1,3,6,7,7,9,10};
        int[] rotatedArray = {5,6,7,8,9,1,2,3};
        System.out.println(isSorted(arr,0));

        System.out.println(rotatedBinarySearch(rotatedArray,4,0, rotatedArray.length-1));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
