import java.util.*;
import java.lang.Math;

class Quiz12_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int first, sec;

        System.out.print("Masukan bilangan Pertama : ");
        first = input.nextInt();
        System.out.print("Masukan bilangan Kedua : ");
        sec = input.nextInt();
        System.out.println("1.Menghitung Rata-Rata : ");
        System.out.println("2.Bilangan tebesar");
        System.out.println("3.Mengalikan Bilangan");
        System.out.print("Masukan Pilihan : ");
        int pil;

        pil = input.nextInt();
        if (pil == 1) {
            double average;

            average = (double) (first + sec) / 2;
            System.out.println("Rata-Rata Bilangan : " + average);
        } else {
            if (pil == 2) {
                if (first > sec) {
                    System.out.println("Bilangan Terbesar : " + first);
                } else {
                    System.out.println("Bilangan Terbesar : " + sec);
                }
            } else {
                int hkali;

                hkali = first * sec;
                System.out.println("Hasil Perkalian : " + hkali);
            }
        }
    }
}
