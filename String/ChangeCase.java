package String;

// User function Template for Java

// function to print the two string
// first string: the first character is changed
// to uppercase
// second string: complete string is changed
// to upper case.
// print both the string in new line.
class ChangeCase {
    public static void changeCase(String s) {
        // code here
        String capitalized = s.substring(0, 1).toUpperCase() + s.substring(1);
        
        String uppercased = s.toUpperCase();
        
        System.out.println(capitalized);
        System.out.println(uppercased);
    }
}
