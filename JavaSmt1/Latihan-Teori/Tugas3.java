import java.util.Scanner;

public class Tugas3 {

    // Fungsi untuk menghitung x pangkat y
    static double hitungPangkat(double x, int y) {
        double hasil = 1;

        for (int i = 0; i < y; i++) {
            hasil *= x;
        }

        return hasil;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Langkah 1: Input nilai x dan y
        System.out.print("Masukkan nilai x: ");
        double x = scanner.nextDouble();

        System.out.print("Masukkan nilai y (bilangan bulat): ");
        int y = scanner.nextInt();

        // Langkah 2: Hitung x pangkat y
        double hasilPangkat = hitungPangkat(x, y);

        // Langkah 3: Tampilkan hasil
        System.out.println(x + " pangkat " + y + " = " + hasilPangkat);

        scanner.close();
    }
}
