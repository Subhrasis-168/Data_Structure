package Advanced;

// User function Template for Java
class CheckPrime {
    public static boolean prime(int n) {

        // write your code here
        if(n <= 1) return false;
        
        for(int i = 2;i * i <= n;i++){
            if(n % i == 0)return false;
        }
        return true;

        // Use BigInteger to solve the problem
    }
}
