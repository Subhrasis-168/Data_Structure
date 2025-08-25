package Practice;

class Practice18 {
    public static double posAverage(int[] arr) {
        // Code here
        int count = 0;
        int max = 0;
        double avg = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= 0){
                count++;
            }
        }
        int [] result= new int [count];
        int index = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= 0){
                result[index++] = arr[i];
            }
        }
        for(int i = 0;i<result.length;i++){
            max = max + result[i];
        }
        avg = max / count;
        return avg;
    }
}

