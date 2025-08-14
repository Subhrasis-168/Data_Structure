package Advanced;

import java.math.BigInteger;

class NthFibonacciNumberUsingBigIntegers{
    public static BigInteger fib(int n) {
        // code here
        if(n == 1 || n == 2){
            return BigInteger.ONE;
        }
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ZERO;
        
        for(int i = 3; i <= n;i++){
            c = a.add(b);
            a=b;
            b=c;
        }
        return c;
    }
}