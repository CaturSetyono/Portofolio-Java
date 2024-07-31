import java.util.Scanner;

public class Latihan3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input harga laptop
        System.out.print("Masukkan harga laptop: ");
        double hargaLaptop = scanner.nextDouble();

        // Input jumlah bulan untuk angsuran
        System.out.print("Masukkan jumlah bulan untuk angsuran (3, 6, atau 12): ");
        int jumlahBulan = scanner.nextInt();

        // Variabel untuk menyimpan total angsuran
        double totalAngsuran = 0.0;

        // Cek kondisi berdasarkan harga laptop
        if (hargaLaptop >= 20000000 || hargaLaptop >= 5000000) {
            switch (jumlahBulan) {
                case 3:
                    totalAngsuran = (hargaLaptop / 3) + (hargaLaptop * 0.005);
                    break;
                case 6:
                    totalAngsuran = (hargaLaptop / 6) + (hargaLaptop * 0.01);
                    break;
                case 12:
                    totalAngsuran = (hargaLaptop / 12) + (hargaLaptop * 0.02);
                    break;
                default:
                    System.out.println("Salah masukan bulan");
                    return;
            }
            System.out.printf("Total angsuran per bulan: %.2f\n", totalAngsuran);
        } else if (hargaLaptop < 5000000) {
            System.out.println("Pembelian harus cash dan tidak dapat diangsur");
        } else {
            System.out.println("Salah masukan");
        }
    }
}
