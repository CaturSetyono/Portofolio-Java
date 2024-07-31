import java.util.Scanner;

public class DeretKuadratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.print("Deret kuadratik untuk n=" + n + ": ");
        generateDeretKuadratik(n);

        scanner.close();
    }

    static void generateDeretKuadratik(int n) {
        for (int i = 1; i <= n; i++) {
            int hasilKuadrat = i * i;
            System.out.print(hasilKuadrat + " ");
        }
        System.out.println();
    }
}
