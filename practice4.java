//DAY BEFORE N DAYS
public class practice4 {
    public static void main(String [] args){
        int d = 2;
        int n = 19;
        int x = n % 7;
        int ans = d - x;
        if (ans >= 0){
            System.out.println(ans);
        }else{
            System.out.println(ans + 7);
        }
    }
}
