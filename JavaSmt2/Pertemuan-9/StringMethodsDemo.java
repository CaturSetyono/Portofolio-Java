public class StringMethodsDemo {
    public static void main(String[] args) {
        // Inisialisasi string
        String str = "Hello, World!";
        String str2 = "   Java Programming   ";
        String str3 = "hello, world!";

        // 1. length()
        int length = str.length();
        System.out.println("str.length(): " + length);

        // 2. charAt()
        char charAt = str.charAt(7);
        System.out.println("str.charAt(7): " + charAt);

        // 3. substring()
        String substring = str.substring(7, 12);
        System.out.println("str.substring(7, 12): " + substring);

        // 4. indexOf()
        int indexOf = str.indexOf('W');
        System.out.println("str.indexOf('W'): " + indexOf);

        // 5. toUpperCase()
        String upperCase = str.toUpperCase();
        System.out.println("str.toUpperCase(): " + upperCase);

        // 6. toLowerCase()
        String lowerCase = str.toLowerCase();
        System.out.println("str.toLowerCase(): " + lowerCase);

        // 7. equals()
        boolean equals = str.equals(str3);
        System.out.println("str.equals(str3): " + equals);

        // 8. equalsIgnoreCase()
        boolean equalsIgnoreCase = str.equalsIgnoreCase(str3);
        System.out.println("str.equalsIgnoreCase(str3): " + equalsIgnoreCase);

        // 9. trim()
        String trimmed = str2.trim();
        System.out.println("str2.trim(): '" + trimmed + "'");

        // 10. replace()
        String replaced = str.replace("World", "Java");
        System.out.println("str.replace('World', 'Java'): " + replaced);
    }
}
