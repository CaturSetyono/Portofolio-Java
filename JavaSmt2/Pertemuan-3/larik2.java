import java.util.Scanner;

public class larik2 {

  public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);

    float nilai[] = new float[5];
    float total, rata;

    System.out.println("Masukan 5 buat data nilai");
    for (int i = 0; i < 5; i++) {
      System.out.print((i + 1) + ": ");
      nilai[i] = masuk.nextFloat();
    }

    System.out.println("Data nilai yang dimasukan");
    for (int i = 0; i < 5; i++)
	System.out.println(nilai[i]);
    total = 0;
    for (int i = 0; i < 5; i++)
    total = total + nilai[i];
    rata = total / 5;
    System.out.println("Total data = " + total);
    System.out.println("Rata-rata = " + rata);
  }
}
