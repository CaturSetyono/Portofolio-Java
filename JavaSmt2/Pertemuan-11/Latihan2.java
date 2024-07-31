public class Latihan2 {
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }

    public static void main(String[] args) {
        int x = 48;
        int y = 18;
        System.out.println("GCD dari " + x + " dan " + y + " adalah: " + gcd(x, y));
    }
}
