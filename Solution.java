//swap two numbers

class Solution {
    public void swap(int a, int b) {
        
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println(a + " " + b);
    }
}
