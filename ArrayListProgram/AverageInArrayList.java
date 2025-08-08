package ArrayListProgram;

// User function Template for Java
class AverageInArrayList {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        int count = 0;
        int sum = 0;
        for(int i = 0;i<list.size();i++){
            int value = list.get(i);
            if(value >= 0){
                sum = sum + value;
                count++;
            }
        }
        return (double) sum / count;
    }
}
