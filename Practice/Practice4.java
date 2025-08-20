package Practice;

class Practice2 {
    public int countDigits(int n) {
        // code here
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }
}

