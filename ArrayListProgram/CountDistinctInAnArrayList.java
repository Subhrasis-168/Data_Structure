package ArrayListProgram;

class CountDistinctInAnArrayList {
    public static int countDistinct(ArrayList<Integer> list) {
        // code here
        HashSet<Integer> set = new HashSet<>(list);
        return set.size();
    }
}
