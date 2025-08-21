package Practice;

// User function Template for Java
class Practice6 {
    public static int nFactorial(int n) {
        int ans = 1;

        // Write your code here
        while(n > 0){
            ans = ans * n;
            n--;
        }

        return ans;
    }
}
