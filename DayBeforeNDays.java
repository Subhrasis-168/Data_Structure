// User function Template for Java
class DayBeforeNDays {
    public static int nthDay(int d, int n) {
        // write your code here
        int x = n % 7;
        int ans = d - x;
        if(ans >= 0){
            return ans;
        }else{
            return (ans + 7);
        }
    }
}