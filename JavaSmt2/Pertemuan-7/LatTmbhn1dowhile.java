import java.util.Scanner;
public class LatTmbhn1dowhile{
public static void main(String[] args) {
        int i = 0;
        int hasil;

        do {
            System.out.println("Nilai i adalah " + i);
            int j = 15;
            do {
                if (i < j) {
                    hasil = i * j;
                } else {
                    hasil = i + j;
                }
                System.out.println("Nilai i =" + i + "dan j =" + j);
                System.out.println("Hasil=" + hasil);
                j -= 3;
            }while(j >= 0);
            i += 2;
        }while ( i <= 10);
        System.out.println("Selesai");
        }
}