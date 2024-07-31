import java.util.Scanner;
public class LatTmbhn1{
public static void main(String[] args) {
        int i;
        int hasil;

        for (i = 0; i <= 10; i += 2) {
            System.out.println("Nilai i adalah " + i);
            int j;

            for (j = 15; j >= 0; j -= 3) {
                if (i < j) {
                    hasil = i * j;
                } else {
                    hasil = i + j;
                }
                System.out.println("Nilai i =" + i + "dan j =" + j);
                System.out.println("Hasil=" + hasil);
            }
        }
        System.out.println("Selesai");
        }

}