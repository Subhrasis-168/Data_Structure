package String;
    public static char extraChar(String s1, String s2) {

        // write your code here
        int result = 0;
        
        for(char ch : s1.toCharArray()){
            result ^=ch;
        }
        
        for(char ch : s2.toCharArray()){
            result ^= ch;
        }
        return (char) result;
    }

