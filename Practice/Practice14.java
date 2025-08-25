package Practice;
class Practice14{
    public static int[] lessThan(int[] numbers, int k) {
        // code here
        int count = 0;
        for(int i = 0;i<numbers.length;i++){
            if(k > numbers[i]){
                count++;
            }
        }
        int [] result = new int[count];
        int index = 0;
        
        for(int i = 0;i<numbers.length;i++){
            if(k > numbers[i]){
                result[index++] = numbers[i];
            }
        }
        return result;
    }
}
