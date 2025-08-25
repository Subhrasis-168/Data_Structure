package Practice;

class Practice17 {
    public static int arraySum(int[] arr) {
        // code here
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            max = max + arr[i];
        }
        return max;
    }
}
