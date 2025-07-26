class AverageOfNonNegativeArray {
    public static double posAverage(int[] arr) {
        // Code here
        int count = 0;
        int sum = 0;
        
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > 0){
                sum += arr[i];
                count++;
            }
        }
        
        return (double) sum / count;
    }
}
