import java.util.Scanner;

public class TampilkanKelipatan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
