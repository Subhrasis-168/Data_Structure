// User function Template for Java
class GCD {
    public static int gcd(int a, int b) {

        // code here to calculate and return gcd of a and b
    int ans = 1;
        int x = Math.min(a , b);
        for(int i = 1; i <= x; i++){
            if(a % i ==0 && b % i == 0){
                ans = i;
            }
        }
        return ans;
    }
}