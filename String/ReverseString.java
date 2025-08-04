package String;

class ReverseString {
    public static String reverseString(String s) {
        // code here
        StringBuilder reversed = new StringBuilder(s);
        return reversed.reverse().toString();
    }
}
