package String;



class CountWordsInString{
    // Complete the function
    // str: input string
    public static int countWords(String str) {
        // find and return the number of words
        // present in the string
        String[] words = str.split(" ");
        return words.length;
    }
}
