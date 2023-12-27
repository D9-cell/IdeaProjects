public class RecursionLevel1 {

    public static void main(String[] args) {

    }

    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.print(n + " ");
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        funBoth(n-1);
        System.out.print(n + " ");
    }
    static int fact(int n){
        if(n <= 1){
            return 1;
        }
        return n * fact(n-1);
    }
    static int sumOfN(int n){
        if(n <= 1){
            return n;
        }
        return n + sumOfN(n-1);
    }
    static int sumOfDigits(int n){
        if(n == 0){
            return n;
        }
        return (n%10) + sumOfDigits(n/10);
    }
    static int productOfDigits(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * productOfDigits(n/10);
    }
    static void wrongConcept(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        wrongConcept(n--);//This is actually A infinite call
    }
    static void rightConcept(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        rightConcept(--n);//This is actually A infinite call
    }
    static int reverse(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helperForReverse(n,digits);
    }
    private static int helperForReverse(int n, int digits) {

        if(n%10 == n){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helperForReverse(n/10,digits-1);
    }
    static boolean isPalindrom(int n){
        return (n == reverse(n));
    }

    static int countZerosInNum(int n){
        return helperForCountZero(n,0);
    }
    private static int helperForCountZero(int n, int count) {
        if(n == 0){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return helperForCountZero(n/10,count+1);
        }
        return helperForCountZero(n/10,count);
    }

    //LeetCode Problem - 1342
    /*
     Given an integer num, return the number of steps to reduce it to zero.
     In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
    */
    public int numberOfSteps(int num) {
        return helperForNumberOfSteps(num,0);
    }

    private int helperForNumberOfSteps(int num,int steps){
        if( num == 0){
            return steps;
        }
        return (num %2 == 0) ? helperForNumberOfSteps(num/2,steps+1) : helperForNumberOfSteps(num-1,steps+1);
//        if(num % 2 == 0){
//            return helperForNumberOfSteps(num/2,steps+1);
//        }
//        return helperForNumberOfSteps(num-1,steps+1);
    }
}
