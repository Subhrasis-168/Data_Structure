package ArrayListProgram;

// User function Template for Java
class ArrayListSeparateEvenOdd {
    public static ArrayList<ArrayList<Integer>> evenOdd(ArrayList<Integer> list) {
        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        
        for(int num : list){
            if(num % 2 == 0){
                evens.add(num);
            }else{
                odds.add(num);
            }
        }
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        result.add(evens);
        result.add(odds);
        return result;
    }
}
