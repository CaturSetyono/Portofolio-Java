import java.util.Scanner;
public class HitungTotalBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char hitungLagi;
        int jumlahBarang;
        double totalBelanja = 0;
        do {
            System.out.print("Hitung Total (y/t)? ");
            hitungLagi = scanner.next().charAt(0);

            if (hitungLagi == 'y' || hitungLagi == 'Y') {
                System.out.print("Jumlah barang? ");
                jumlahBarang = scanner.nextInt();

                for (int i = 1; i <= jumlahBarang; i++) {
                    System.out.println("Barang " + i + ":");
                    System.out.print("Jumlah? ");
                    int jumlah = scanner.nextInt();
                    System.out.print("Harga? ");
                    double harga = scanner.nextDouble();
                    totalBelanja += jumlah * harga;
                }
                System.out.println("Total Belanja = " + totalBelanja);
            } else if (hitungLagi != 't' && hitungLagi != 'T') {
                System.out.println("Pilihan tidak valid. Silakan masukkan 'y' atau 't'.");
            }
        } while (hitungLagi != 't' && hitungLagi != 'T');
        System.out.println("Terima kasih!");
        scanner.close();
    }
}
