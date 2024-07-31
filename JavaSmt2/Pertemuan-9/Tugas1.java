class MethodsDemo {
    public void math() {
        // 1. Math.exp()
        double expValue = Math.exp(2);
        System.out.println("Math.exp(2): " + expValue);

        // 2. Math.log()
        double logValue = Math.log(10);
        System.out.println("Math.log(10): " + logValue);

        // 3. Math.cos()
        double cosValue = Math.cos(Math.toRadians(60));
        System.out.println("Math.cos(60 degrees): " + cosValue);

        // 4. Math.tan()
        double tanValue = Math.tan(Math.toRadians(45));
        System.out.println("Math.tan(45 degrees): " + tanValue);

        // 5. Math.atan()
        double atanValue = Math.atan(1);
        System.out.println("Math.atan(1): " + atanValue);

        // 6. Math.cbrt()
        double cbrtValue = Math.cbrt(27);
        System.out.println("Math.cbrt(27): " + cbrtValue);

        // 7. Math.hypot()
        double hypotValue = Math.hypot(3, 4);
        System.out.println("Math.hypot(3, 4): " + hypotValue);

        // 8. Math.toDegrees()
        double degrees = Math.toDegrees(Math.PI / 2);
        System.out.println("Math.toDegrees(π/2): " + degrees);

        // 9. Math.toRadians()
        double radians = Math.toRadians(180);
        System.out.println("Math.toRadians(180 degrees): " + radians);
    }

    public void string() {
        // Inisialisasi string
        String str = "Hello, World!";
        String str2 = "   Java Programming   ";

        // 1. isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("str.isEmpty(): " + isEmpty);

        // 2. startsWith()
        boolean startsWith = str.startsWith("Hello");
        System.out.println("str.startsWith(\"Hello\"): " + startsWith);

        // 3. endsWith()
        boolean endsWith = str.endsWith("World!");
        System.out.println("str.endsWith(\"World!\"): " + endsWith);

        // 4. contains()
        boolean contains = str.contains("World");
        System.out.println("str.contains(\"World\"): " + contains);

        // 5. indexOf()
        int indexOf = str.indexOf('o');
        System.out.println("str.indexOf('o'): " + indexOf);

        // 6. lastIndexOf()
        int lastIndexOf = str.lastIndexOf('o');
        System.out.println("str.lastIndexOf('o'): " + lastIndexOf);

        // 7. concat()
        String concat = str.concat(" Welcome");
        System.out.println("str.concat(\" Welcome\"): " + concat);

        // 8. replaceAll()
        String replacedAll = str.replaceAll("o", "X");
        System.out.println("str.replaceAll(\"o\", \"X\"): " + replacedAll);

        // 9. substring()
        String substring = str.substring(7);
        System.out.println("str.substring(7): " + substring);

        // 10. split()
        String[] splitArray = str2.trim().split("\\s+");
        System.out.print("str2.trim().split(\"\\\\s+\"): ");
        for (String s : splitArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        MethodsDemo demo = new MethodsDemo();
        demo.math();
        demo.string();
    }
}