import java.util.Scanner;

public class Lat2 {
    public static int minimal(int a, int b) {
        return Math.min(a, b);
    }

    public static int maksimal(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan a: ");
        int a = in.nextInt();  // Simpan input ke variabel a
        System.out.print("Masukkan bilangan b: ");
        int b = in.nextInt();  // Simpan input ke variabel b

        int minimal = minimal(a, b);
        int maksimal = maksimal(a, b);

        System.out.println("Bilangan Minimal  : " + minimal);
        System.out.println("Bilangan Maksimal : " + maksimal);
    }
}
