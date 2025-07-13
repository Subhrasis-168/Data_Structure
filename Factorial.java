// User function Template for Java
class Factorial {
    public static int nFactorial(int n) {
        int ans = 1;

        // Write your code here
        while( n > 0){
            ans = ans * n;
            n--;
        }

        return ans;
    }
}