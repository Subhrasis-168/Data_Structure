// User function Template for Java
class Diviser {
    public static void divisor(int n) {
        int ans;
        // Write your code here
        for(int i =1; i <= n ; i++){
            if(n % i == 0){
                System.out.print(i+ " ");
            }
        }
    }
}