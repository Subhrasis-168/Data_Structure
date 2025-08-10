package ArrayListProgram;

class GetSmallerElements {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int num : arr){
            if(num < target){
                result.add(num);
            }
        }
        return result;
    }
}
