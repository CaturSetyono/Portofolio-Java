public class FindMinimumRecursive {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int min = recursiveMinimum(array, array.length);
        System.out.println("Minimum value is: " + min);
    }

    public static int recursiveMinimum(int[] array, int n) {
        if (n == 1) {
            return array[0];
        }
        return Math.min(array[n - 1], recursiveMinimum(array, n - 1));
    }
}
