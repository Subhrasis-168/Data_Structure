package Practice;

// User function Template for Java
class Practice7 {
    public static void divisor(int n) {

        // Write your code here
        for(int i = 1;i<=n;i++){
            if(n % i == 0){
                System.out.print(i +" ");
            }
        }
    }
}
