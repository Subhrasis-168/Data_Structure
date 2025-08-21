package Practice;

class Practice9 {
    public static int fibonacci(int n) {
        // Write your code here to calculate
        // to calculate the nth fibonacci number
        if(n == 0) return 0;
        if(n == 1 || n == 2){
            return 1;
        }
        int a = 1 , b = 1;
        int fib = 0;
        for(int i = 3;i <= n; i++){
            fib = a + b;
            a = b;
            b = fib;
        }
        return fib;
    }
}

