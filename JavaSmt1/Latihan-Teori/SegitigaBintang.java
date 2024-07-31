import java.util.Scanner;
public class SegitigaBintang{
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan tinggi Segitiga A = ");
		int tinggiA = input.nextInt();

        // Segitiga A
        for (int baris=tinggiA; tinggiA >=1; tinggiA--){
			for (int i = 1; i <=tinggiA; i++) {
				System.out.print(" *");
			}
		        System.out.println();
	    }
	    System.out.print("Masukan tinggi Segitiga B = ");
		int tinggiB = input.nextInt();
		for (int baris=1; baris <=tinggiB; baris++){
			for (int i = 1; i <=baris; i++) {
				System.out.print(" *");
			}
				System.out.println();
		}
    }
}