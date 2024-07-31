import java.util.Scanner;

public class modifProyekHitungJumlah {

    public static int hitungJumlah(int[] x) {
        int jum = 0;
        for (int i = 0; i < x.length; i++) {
            jum += x[i];
        }
        return jum;
    }

    public static double hitungRata(int[] x) {
        int jum = hitungJumlah(x);
        return (double) jum / x.length;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        int jumlah;
        double rata2;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ":");
            data[i] = scan.nextInt();
        }
        jumlah = hitungJumlah(data);
        rata2 = hitungRata(data);
        System.out.println("Jumlah data = " + jumlah);
        System.out.println("Rata-Rata = " + rata2);
    }
}
