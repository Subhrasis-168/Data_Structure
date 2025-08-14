package Advanced;

import java.math.BigInteger;

class NextPrimeBigInteger {
    public static int nextPrime(int n) {

        // write your code here
        BigInteger current = BigInteger.valueOf(n);
        
        return current.nextProbablePrime().intValue();

        // Use BigInteger to solve
    }
}
