import java.util.Scanner;

public class NilaiMhsAlgo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        // Deklarasi array untuk menyimpan data
        String[] nama = new String[jumlahMahasiswa];
        String[] nim = new String[jumlahMahasiswa];
        int[][] nilaiTugas = new int[jumlahMahasiswa][3];

        // Perulangan untuk input data
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));

            // Input nama
            System.out.print("Nama: ");
            nama[i] = input.next();

            // Input NIM
            System.out.print("NIM: ");
            nim[i] = input.next();

            // Input nilai tugas
            for (int j = 0; j < 3; j++) {
                System.out.print("Nilai tugas " + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }

        // Tampilkan tabel data
        System.out.println("\n==============================================================");
        System.out.println("| Nama      |   NIM   | Tugas 1 | Tugas 2 | Tugas 3 | Rata-rata     |");
        System.out.println("================================================================");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            double rataRata = 0;
            for (int j = 0; j < 3; j++) {
                rataRata += nilaiTugas[i][j];
            }
            rataRata /= 3;

            System.out.printf("| %-10s | %-10s | %6d | %6d | %6d | %10.2f |\n",
                nama[i], nim[i], nilaiTugas[i][0], nilaiTugas[i][1], nilaiTugas[i][2], rataRata);
        }
        System.out.println("===================================================");
    }
}
