import java.util.Scanner;

public class LatTmbh2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah mahasiswa
        int jumlahMahasiswa = 10;

        // Mata kuliah
        String[] mataKuliah = {"Matakulia 1", "Matakuliah 2", "Matakuliah 3"};

        // Array untuk menyimpan nilai
        int[][] nilai = new int[jumlahMahasiswa][mataKuliah.length];

        // Memasukkan nilai
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print("Nilai " + mataKuliah[j] + ": ");
                nilai[i][j] = input.nextInt();

                // Validasi nilai
                while (nilai[i][j] < 0 || nilai[i][j] > 100) {
                    System.out.print("Nilai harus antara 0-100. Masukkan kembali: ");
                    nilai[i][j] = input.nextInt();
                }
            }
        }

        // Tampilkan tabel
        System.out.println("\n\nTabel Nilai dan Keterangan");
        System.out.println("--------------------------------------------------");
        System.out.print("|	 Nama	 |");
        for (String mk : mataKuliah) {
            System.out.print(" " + mk + " |");
        }
        System.out.print(" Rata-rata | Keterangan |");
        System.out.println("\n--------------------------------------------------");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            double totalNilai = 0;
            for (int j = 0; j < mataKuliah.length; j++) {
                totalNilai += nilai[i][j];
            }

            double rataRata = totalNilai / mataKuliah.length;
            String keterangan = "";

            if (rataRata >= 80 && rataRata <= 100) {
                keterangan = "Sangat Baik";
            } else if (rataRata >= 50 && rataRata < 80) {
                keterangan = "Baik";
            } else {
                keterangan = "Kurang Baik";
            }

            System.out.print("| ");
            System.out.print("Mahasiswa " + (i + 1) + " \t|");
            for (int j = 0; j < mataKuliah.length; j++) {
                System.out.print(" \t " + nilai[i][j] + " |");
            }
            System.out.printf(" \t%.2f |\t %s |\n", rataRata, keterangan);
        }

        System.out.println("--------------------------------------------------");
    }
}