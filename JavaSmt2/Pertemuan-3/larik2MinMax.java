import java.util.Scanner;

public class larik2MinMax {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    float nilai[] = new float[5];
    float total = 0, rata, max = 0, min = Float.MAX_VALUE;

    // Memasukkan data nilai
    System.out.println("Masukkan 5 data nilai: ");
    for (int i = 0; i < nilai.length; i++) {
      System.out.print((i + 1) + ": ");
      nilai[i] = input.nextFloat();
    }

    // Mencari nilai maksimum dan minimum
    for (float bilangan : nilai) {
      if (bilangan > max) {
        max = bilangan;
      }
      if (bilangan < min) {
        min = bilangan;
      }
      total += bilangan;
    }

    // Menghitung rata-rata
    rata = total / nilai.length;

    // Menampilkan hasil
    System.out.println("\nData nilai yang dimasukkan:");
    for (float bilangan : nilai) {
      System.out.println(bilangan);
    }
    System.out.println("\nTotal data = " + total);
    System.out.println("Rata-rata = " + rata);
    System.out.println("Nilai maksimum = " + max);
    System.out.println("Nilai minimum = " + min);
  }
}
