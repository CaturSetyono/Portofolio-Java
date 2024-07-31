public class PrintArrayIterative {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        printArrayIterative(array);
    }

    public static void printArrayIterative(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
