package TopInterviewQuestion.Medium;

/*
204. Count Primes
        Given an integer n, return the number of prime numbers that are strictly less than n.

        Example 1:

        Input: n = 10
        Output: 4
        Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
        Example 2:

        Input: n = 0
        Output: 0
        Example 3:

        Input: n = 1
        Output: 0


        Constraints:

        0 <= n <= 5 * 106
*/
public class CountPrimes {

    public int countPrimes(int n) {
        if(n<=1){
            return 0;
        }
        boolean[] primes = new boolean[n+1];
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i*i <= n; i++) {
            if(!primes[i]){
                int j=i+i;
                while(j<n){
                    primes[j]=true;
                    j=j+i;
                }
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            if(!primes[i]){
                result++;
            }
        }
        return result;
    }
}
