package Advanced;

// User function Template for Java

class JavaExpectionHandling {
    public int findMin(int a, int b) {
        // Your code here
        int add = a +b;
        int sub = a -b;
        int mul = a * b;
        int div;
        
        try{
            div = a /b;
            
        }catch (ArithmeticException e){
            div = Integer.MAX_VALUE;
        }
        return Math.min(Math.min(add , sub) , Math.min(mul, div));
    }
}