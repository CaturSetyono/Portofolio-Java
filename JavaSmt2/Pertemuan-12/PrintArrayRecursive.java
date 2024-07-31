public class PrintArrayRecursive {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        printArray(array, 0);
    }

    public static void printArray(int[] array, int index) {
        if (index == array.length) {
            return;
        }
        System.out.println(array[index]);
        printArray(array, index + 1);
    }
}
