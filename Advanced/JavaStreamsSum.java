package Advanced;

class JavaStreamsSum {
    public static int sumUsingStreams(int[] arr) {
        // code here
        return Arrays.stream(arr).sum();
    }
}
