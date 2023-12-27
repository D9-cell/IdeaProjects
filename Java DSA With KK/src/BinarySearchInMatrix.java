import java.util.Arrays;

public class BinarySearchInMatrix {

    public static void main(String[] args) {
        int arr[][] = {
                {10, 20, 30, 40},
                {15, 25, 34, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        System.out.println(Arrays.toString(BSinMatrix(arr,37)));
    }

    //This matrix is sorted in Row And Column Wise
    private static int[] BSinMatrix(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;

        while(row < matrix.length && column > 0){
            if(matrix[row][column] == target){
                return new int[]{row,column};
            }else if (matrix[row][column] > target){
                column--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }

    //Search in row provided between the column provided
    static int[] binarySearch(int[][] matrix,int row,int cStart,int cEnd,int target){
        while(cStart <= cEnd){
            int mid = cStart + (cEnd - cStart)/2;
            if( matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
//    private static int[] search(int[][] matrix,int target){
//        int rows = matrix.length;
//        int cols = matrix[0].length;
//
//        if(rows == 1){
//            return binarySearch(matrix,0,0, cols-1,target);
//        }
//
//        int rStart = 0;
//        int rEnd = rows - 1;
//        int cMid = cols/2;
//        //run the loop till 2 rows are remaining
//        while(rStart < (rEnd - 1)){
//            //While this is true it will have more than 2 rows
//            int mid = rStart + (rEnd - rStart) / 2;
//            if(matrix[mid][cMid] == target){
//                return new int[]{mid,cMid};
//            }
//            if(matrix[mid][cMid] < target){
//                rStart = mid;
//            }else{
//                rEnd = mid;
//            }
//        }
//    }
}
