import java.util.Scanner;
public class LatTmbhn1while{
public static void main(String[] args) {
        int i = 0;
        int hasil;

        while ( i <= 10) {
            System.out.println("Nilai i adalah " + i);
            int j = 15;
            while( j >= 0) {
                if (i < j) {
                    hasil = i * j;
                } else {
                    hasil = i + j;
                }
                System.out.println("Nilai i =" + i + "dan j =" + j);
                System.out.println("Hasil=" + hasil);
                j -= 3;
            }
            i += 2;
        }
        System.out.println("Selesai");
        }
}