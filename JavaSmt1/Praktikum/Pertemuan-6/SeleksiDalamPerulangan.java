import java.util.Scanner;
public class SeleksiDalamPerulangan {
public static void main(String[] args) {

    int JPB = 0, JM = 0, jumlah = 0;
    int jawab = 1;
	System.out.println("Kategori barang: ");
    System.out.println("1. Pecah belah : ");
    System.out.println("2. Makanan: ");

    Scanner masuk = new Scanner(System.in);
    while (jawab != 0) {
      System.out.println("Masukkan Kategori barang (1,2): ");
      int kategori = masuk.nextInt();

      if (kategori == 1) {
        JPB++;
      } else {
        JM++;
      }
      System.out.println("Barang habis ? (0=ya,1=tidak) ");
      jawab = masuk.nextInt();
    }
    System.out.println("");
    System.out.println("");
    System.out.println("Jumlah Pecah belah = " + JPB);
    System.out.println("Jumlah makanan = " + JM);
  }
}
