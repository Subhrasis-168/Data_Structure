package Advanced;

import java.math.BigInteger;
class Solution {
    public static BigInteger factorial(int n) {
        // code here
        BigInteger result = BigInteger.ONE;
        
        for(int i = 2; i <= n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
