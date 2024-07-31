import java.util.Scanner;
public class For_if1 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int nilai, i;
        System.out.print("Masukkan angka bulat (0-100) = ");
        nilai = masuk.nextInt();
        if (nilai >= 60) {
            for (i = 0; i <= 5; i++) {
                System.out.println("Kamu hebat...!");
            }
        } else {
            for (i = 0; i <= 5; i++) {
                System.out.println("Belajar lagi ya....");
            }
        }
    }
}
