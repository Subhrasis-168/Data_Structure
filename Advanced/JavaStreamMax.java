package Advanced;

// User function Template for Java
class JavaStreamMax {

    public static int maxUsingStreams(int[] arr) {
        // Your code here
        return Arrays.stream(arr).max().getAsInt();

        // Use stream().max().getAsInt()
    }
}
