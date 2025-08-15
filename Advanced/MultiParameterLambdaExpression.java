package Advanced;

// User function Template for Java

/*
The interface looks like

interface Add {
    public int addParameters(int a, int b);
}
*/

class MultiParameterLambdaExpression {
    public static Add helperFunction() {
        // Your code here
        return (a , b) -> a+b;

        // Implement the addParameters method that returns a+b.
    }
}
