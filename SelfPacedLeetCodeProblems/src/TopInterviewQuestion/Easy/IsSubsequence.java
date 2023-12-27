package TopInterviewQuestion.Easy;
/*
392. Is Subsequence
    ________________________________________________________________________________________________________
    |Given two strings s and t, return true if s is a subsequence of t, or false otherwise.                |
    |A subsequence of a string is a new string that is formed from the original string by deleting some    |
    |(can be none) of the characters without disturbing the relative positions of the remaining characters.|
    |(i.e., "ace" is a subsequence of "abcde" while "aec" is not).                                         |
    |______________________________________________________________________________________________________|
    |Example 1:                       |  Example 2:                                                        |
    |Input: s = "abc", t = "ahbgdc"   |  Input: s = "axc", t = "ahbgdc"                                    |
    |Output: true                     |  Output: false                                                     |
    |______________________________________________________________________________________________________|
    |Constraints:                                                                                          |
    |0 <= s.length <= 100  |  0 <= t.length <= 10^4 |  s and t consist only of lowercase English letters.  |
    |______________________________________________________________________________________________________|
    |Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to  |
    |check one by one to see if t has its subsequence. In this scenario, how would you change your code?   |
    |______________________________________________________________________________________________________|
*/

public class IsSubsequence {

    public boolean isSubsequence(String s, String t) {
        int sIndex = 0, tIndex = 0;
        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }
        return sIndex == s.length();
    }
}
