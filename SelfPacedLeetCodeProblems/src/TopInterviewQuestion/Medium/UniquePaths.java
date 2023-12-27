package TopInterviewQuestion.Medium;
/*
62. Unique Paths
        There is a robot on an m x n grid. The robot is initially located at the top-left corner
        (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]).
        The robot can only move either down or right at any point in time.

        Given the two integers m and n, return the number of possible unique paths
        that the robot can take to reach the bottom-right corner.

        The test cases are generated so that the answer will be less than or equal to 2 * 109.

        Example 1:

        Input: m = 3, n = 7
        Output: 28
                    28	21	15	10	6	3	1
                    7	6	5	4	3	2	1
                    1	1	1	1	1	1	0

        Example 2:

        Input: m = 3, n = 2
        Output: 3
                    3	1
                    2	1
                    1	0

         Example 2:

        Input: m = 3, n = 3
        Output: 6
                    6	3	1
                    3	2	1
                    1	1	0

        Constraints:    1 <= m, n <= 100
*/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];
        matrix[m-1][n-1] = 0;
        for (int i=0;i<m;i++) {
            matrix[i][n-1] = 1;
        }
        for (int i=0;i<n;i++) {
            matrix[m-1][i] = 1;
        }
        for (int i = m-2; i <=0 ; i--) {
            for (int j = n-2; j <= 0 ; j--) {
                matrix[i][j] = matrix[i][j+1] + matrix[i+1][j];
            }
        }
        return matrix[0][0];
    }
}
