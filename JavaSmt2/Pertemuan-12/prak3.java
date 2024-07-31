import java.util.Scanner;
public class prak3 {
    public static int hitungJumlah(int[] x) {
        int jum = 0;
        for (int i = 0; i < x.length; i++) {
            jum += x[i];
        }
        return jum;
    }

    public static void main(String[] args) {
        int data[] = new int[10];
        int jumlah;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukan data ke-" + (i + 1) + ":");
            data[i] = input .nextInt();
        }
        jumlah = hitungJumlah(data);
        System.out.print("Jumlah data = " + jumlah);
    }
}
