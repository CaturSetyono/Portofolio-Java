public class FindMinimumIterative {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        int min = iterativeMinimum(array);
        System.out.println("Minimum value is: " + min);
    }

    public static int iterativeMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
