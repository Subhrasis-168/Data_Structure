package Advanced;

class NoParameterLambdaExpression {
    public static Hello helperFunction() {
        // Your code here
        

        // Implement sayHello using lambda expression and return the object.
        // Write this in the lambda expression: System.out.println("Hello")
        return () -> System.out.println("Hello");
    }
}