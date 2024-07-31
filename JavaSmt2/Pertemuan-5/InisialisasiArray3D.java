import java.util.Scanner;
public class InisialisasiArray3D{

  public static void main (String args []){

    Scanner input = new Scanner (System.in);

    System.out.print("Masukkan jumlah siswa: ");

    final int JUMLAH_SISWA = input.nextInt();

    System.out.println("Berapa kali ujian dilakukan: ");

    final int JUMLAH_UJIAN = input.nextInt();

    double [][][] nilai = new double [JUMLAH_SISWA][JUMLAH_UJIAN][2];

    System.out.println("Silakan masukkan data: ");

    //Membaca nilai yang diinput oleh user
    for (int a = 0; a < JUMLAH_SISWA * JUMLAH_UJIAN; a++){
		System.out.println("Masukkan nomor Siswa");
      int nomorSiswa = input.nextInt();
      System.out.println("Masukkan nomor ujian");
      int nomorUjian = input.nextInt();
      System.out.println("Masukkan nilai pilihan ganda");
      double nilaiPilihanGanda = input.nextDouble();
      System.out.println("Masukkan nilai essay");
      double nilaiEssay = input.nextDouble();
      nilai[nomorSiswa - 1][nomorUjian - 1] [0] = nilaiPilihanGanda;
      nilai[nomorSiswa - 1][nomorUjian - 1] [1] = nilaiEssay;
    }

    //Menampilkan array
    System.out.println("Array nilai ditampilkan: ");
    for (int i =0; i < nilai.length; i++){
      for(int j = 0; j < nilai[0].length; j++){
        for(int k = 0; k < nilai[0][0].length; k++ ){
          System.out.print("nilai[" +i+ "][" +j+ "][" +k+ "] = " + nilai [i][j][k]+ "\t");
        }
        System.out.println();
      } System.out.println();
    }

    //Menghitung nilai rata-rata
    System.out.println("Nilai rata-rata siswa: ");
    for (int i = 0; i < nilai.length; i++){
      double totalNilaiPilihanGanda = 0, totalNilaiEssay = 0;
      for (int j = 0; j < nilai[0].length; j++){
        totalNilaiPilihanGanda += nilai [i][j][0];
        totalNilaiEssay += nilai [i][j][1];
      }
      //Menampilkan hasil
      double pilihanGanda = totalNilaiPilihanGanda / nilai[0].length;
      double essay = totalNilaiEssay / nilai[0].length;
      System.out.printf("Nilai rata-rata ujian soal pilihan ganda siswa " + (i + 1) + " adalah %4.2f \n", pilihanGanda);
      System.out.printf("Nilai rata-rata ujian soal essay siswa " + (i + 1) + " adalah %4.2f \n", essay);
      System.out.println();
    }
  }
}
