public class Latihan1 {
    public static void main(String[] args) {
        int A = 2; // Misalnya A adalah 2
        int B = 5; // Misalnya B adalah 5
        int hasil = pangkat(A, B);
        System.out.println("Hasil " + A + "^" + B + " adalah: " + hasil);
    }

    // Method untuk menghitung pangkat secara rekursif
    public static int pangkat(int A, int B) {
        if (B == 0) {
            return 1;
        } else {
            return A * pangkat(A, B - 1);
        }
    }
}
