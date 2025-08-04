

class PanagramChecking {

    // Complete the function
    // str: input string
    public static boolean isPanagram(String str) {
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }
        return set.size() == 26;
        // Check if given string is panagram
    }
}