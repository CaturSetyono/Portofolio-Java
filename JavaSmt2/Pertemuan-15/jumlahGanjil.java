import java.util.Scanner;

public class jumlahGanjil {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("+---------------------------------------------------------+");
		System.out.println("|Program Untuk Menampilkan Jumlah Bilangan dar 1 sampai n |");
	    System.out.println("+---------------------------------------------------------+");
        System.out.print("|Masukkan nilai n : ");
        int n = input.nextInt();

        int jumlahGanjil = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
		System.out.println("+---------------------------------------------------------+");
        System.out.println("|Jumlah bilangan ganjil dari 1 hingga " + n + " adalah: " + jumlahGanjil);
        System.out.println("+---------------------------------------------------------+");
    }
}
