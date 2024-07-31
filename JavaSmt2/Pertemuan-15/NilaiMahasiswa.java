import java.util.Scanner;
public class NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();
        input.nextLine();
        String[] namaMahasiswa = new String[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nama mahasiswa " + (i + 1) + ": ");
            namaMahasiswa[i] = input.nextLine();
        }

        System.out.print("Masukkan jumlah mata kuliah : ");
        int jumlahMataKuliah = input.nextInt();
        input.nextLine();
        String[] namaMataKuliah = new String[jumlahMataKuliah];
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nama mata kuliah " + (i + 1) + ": ");
            namaMataKuliah[i] = input.nextLine();
        }

        System.out.print("Masukkan jumlah ujian: ");
        int jumlahUjian = input.nextInt();

        double[][][] nilaiMahasiswa = new double[jumlahMahasiswa][jumlahMataKuliah][jumlahUjian];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMataKuliah; j++) {
                for (int k = 0; k < jumlahUjian; k++) {
                    System.out.print("Masukkan nilai " + namaMahasiswa[i] + " mata kuliah " + namaMataKuliah[j] + " ujian " + (k + 1) + ": ");
                    nilaiMahasiswa[i][j][k] = input.nextDouble();
                }
            }
        }

        System.out.println("\n===============================================================");
        System.out.println("No\tNama Mahasiswa\t\t\tMata Kuliah\t\t\tRata-rata Nilai");
        System.out.println("===============================================================");

        int no = 1;
        for (int i = 0; i < jumlahMahasiswa; i++) {
            for (int j = 0; j < jumlahMataKuliah; j++) {
                double rataRataMataKuliah = 0;
                for (int k = 0; k < jumlahUjian; k++) {
                    rataRataMataKuliah += nilaiMahasiswa[i][j][k];
                }
                rataRataMataKuliah /= jumlahUjian;
                System.out.println(no + "\t" + namaMahasiswa[i] + "\t\t" + namaMataKuliah[j] + "\t\t" + String.format("%.2f", rataRataMataKuliah));
                no++;
            }
        }
        System.out.println("===============================================================");
    }
}
