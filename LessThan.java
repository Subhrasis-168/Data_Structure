class LessThan {
    public static int[] lessThan(int[] numbers, int k) {
        // code here
        int count = 0;
        for(int i =0;i<numbers.length;i++){
            if(numbers[i] < k){
                count++;
            }
        }
        int [] result = new int [count];
        int index = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i]<k){
                result[index++] = numbers[i];
            }
        }
        return result;
    }
}
