public class ReverseStringIterative {
    public static void main(String[] args) {
        String input = "hello";
        char[] charArray = input.toCharArray();
        stringReverseIterative(charArray);
    }

    public static void stringReverseIterative(char[] charArray) {
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
    }
}
