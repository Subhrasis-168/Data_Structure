package Practice;

class Practice15 {
    public static int[] evenOdd(int[] numbers) {
        // write your code here
        int count = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] % 2 == 0){
                count++;
            }
        }
        int [] arr = new int [count];
        int index = 0;
        for(int i = 0;i<numbers.length;i++){
            if(numbers[i] % 2 == 0){
                arr[index++] = numbers[i];
            }
        }
        return arr;
    }
}
