package TopInterviewQuestion.Medium;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

/*
322. Coin Change
       ________________________________________________________________________________________
       |You are given an integer array "coins" representing coins of different denominations  |
       |and an integer "amount" representing a total amount of money.                         |
       |Return the fewest number of coins that you need to make up that amount.               |
       |If that amount of money cannot be made up by any combination of the coins, return -1. |
       |You may assume that you have an infinite number of each kind of coin.                 |
       |______________________________________________________________________________________|
Example 1:                             |     Constraints:
Input: coins = [1,2,5], amount = 11    |     1 <= coins.length <= 12
Output: 3                              |     1 <= coins[i] <= 2^31 - 1
Explanation: 11 = 5 + 5 + 1            |     0 <= amount <= 10^4
---------------------------------------|---------------------------------------
Example 2:                             |     Example 3:
Input: coins = [2], amount = 3         |     Input: coins = [1], amount = 0
Output: -1                             |     Output: 0


*/
public class CoinChange {


    public int coinChange(int[] coins, int amount) {
        if(amount < 1){
            return 0;
        }
        int[] minCoins = new int[amount+1];
        Arrays.fill(minCoins,Integer.MAX_VALUE);
        for (int i = 1; i <= amount ; i++) {
            for (int coin: coins) {
                if(coin <= i && minCoins[i-coin] != Integer.MAX_VALUE){
                    minCoins[i] = Math.min(minCoins[i],1+minCoins[i-coin]);
                }
            }
        }
//        if(minCoins[amount]==Integer.MAX_VALUE){return -1;}
        return (minCoins[amount]==Integer.MAX_VALUE)?-1:minCoins[amount];
    }

}
