public class ReverseStringRecursive {
    public static void main(String[] args) {
        String input = "hello";
        char[] charArray = input.toCharArray();
        stringReverse(charArray, charArray.length - 1);
    }

    public static void stringReverse(char[] charArray, int index) {
        if (index < 0) {
            return;
        }
        System.out.print(charArray[index]);
        stringReverse(charArray, index - 1);
    }
}
