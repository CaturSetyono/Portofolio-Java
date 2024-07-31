import java.util.Scanner;

 public class Tugas13 {

	 public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int pilihan;

		do {
			System.out.println("==PILIHAN MENU==");
			System.out.println(" 1.Fibonacci");
			System.out.println(" 2.Faktorial");
			System.out.println(" 3.Keluar");
			System.out.print("Masukan Pilihan : ");
			pilihan = input.nextInt();

			switch (pilihan){
				case 1:
						fibonacci();
				break;
				case 2:
						faktorial();
				break;
				case 3:
						System.out.println(" Program Telah Selesai ");
				break;
				default:
						System.out.println(" Pilihan Hanya Angka 1-3 ");
				}
		}while (pilihan != 3);
	}
	static void fibonacci() {
		Scanner input = new Scanner(System.in);

		int n;

		System.out.print("Masukan Jumlah Deret : ");
		n = input.nextInt();

		int[] fibonacci = new int[n];

		fibonacci[1] = 0;
		fibonacci[1] = 1;

		for (int i = 2;i<n;i++){
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}

		System.out.println("Deret Bilangan Fibonacci :");
		for (int i = 0; i < n; i++){
			System.out.print(fibonacci[i] + " ");
		}
		System.out.println();
	}

	static void faktorial() {
	        Scanner input = new Scanner(System.in);

	        int n;

	        System.out.print("Masukkan bilangan untuk menghitung faktorial: ");
	        n = input.nextInt();

	        int faktorial = 1;

	        for (int i = 1; i <= n; i++) {
	            faktorial *= i;
	        }

	        System.out.println("Faktorial dari " + n + " adalah " + faktorial);
	    }
	}
