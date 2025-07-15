// User function Template for Java
class LCM {
    public static int LCM(int a, int b) {

        // write your code here
        int y = Math.max(a , b);
        int x = a * b;
        int ans = x;
        for(int i = y; i<=x; i++){
            if(i % a == 0 && i % b == 0){
            ans = i;
            break;
            }
        }
return ans;

    }
}