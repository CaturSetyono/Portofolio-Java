import java.util.Scanner;

public class NilaiMataKuliah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa;
        int jumlahMataKuliah = 3;
		System.out.print("Masukan Jumlah Siswa : ");
		jumlahSiswa = input.nextInt();
        String[] namaSiswa = new String[jumlahSiswa];
        double[][] nilaiMataKuliah = new double[jumlahSiswa][jumlahMataKuliah];
        double[] rataRata = new double[jumlahSiswa];
        String[] keterangan = new String[jumlahSiswa];

        // Input nilai per siswa
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = input.next();
            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Masukkan nilai mata kuliah " + (j + 1) + " untuk " + namaSiswa[i] + ": ");
                nilaiMataKuliah[i][j] = input.nextDouble();
            }

            // Hitung rata-rata
            double totalNilai = 0;
            for (double nilai : nilaiMataKuliah[i]) {
                totalNilai += nilai;
            }
            rataRata[i] = totalNilai / jumlahMataKuliah;

            // Berikan keterangan
            if (rataRata[i] >= 80) {
                keterangan[i] = "Sangat Baik";
            } else if (rataRata[i] >= 50) {
                keterangan[i] = "Baik";
            } else {
                keterangan[i] = "Kurang Baik";
            }

            input.nextLine(); // Clear newline
        }

        // Tampilkan dalam bentuk tabel
        System.out.println("\nNama\tMata kuliah 1\tMata kuliah 2\tMata kuliah 3\tRata-rata");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.printf("%s\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%s%n",
                    namaSiswa[i], nilaiMataKuliah[i][0], nilaiMataKuliah[i][1],
                    nilaiMataKuliah[i][2], rataRata[i], keterangan[i]);
        }
    }
}
