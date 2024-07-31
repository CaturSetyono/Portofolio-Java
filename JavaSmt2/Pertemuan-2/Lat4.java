public class Lat4 {

    public static void main(String[] args) {
        int baris = 5; // Sesuaikan nilai ini untuk mengubah jumlah baris

        for (int i = baris; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.print("UTDI");

            System.out.println();
        }
    }
}
