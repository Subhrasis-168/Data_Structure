class Calculator {
    public static void utility(int a, int b, int operator) {

        // write your code here
        switch (operator){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}