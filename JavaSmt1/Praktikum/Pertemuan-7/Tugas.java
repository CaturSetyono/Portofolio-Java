import java.util.Scanner;
public class Tugas {
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		int pil, jmlh, faktorial, hasil=1;
		System.out.println("Menu Pilihan");
		System.out.println("1. Fibonacci");
		System.out.println("2. Faktorial");
		System.out.print(" Masukan Pilihan anda = ");
		pil=masuk.nextInt();
		if (pil == 1){
			int fib2, fib1, fib;
			System.out.print("Masukkan jumlah deret : ");
			jmlh=masuk.nextInt();
			fib2 = 0;
			fib1 = 1;
			fib = 1;
			for(int i=1; i<=jmlh; i++){
				System.out.print(fib + " ");
				fib = fib1+fib2;
				fib2 = fib1;
				fib1 = fib;
			}
		}
		else {
			System.out.print("Masukkan faktorial = ");
			faktorial=masuk.nextInt();
			for(int i=1; i<=faktorial; i++) {
				hasil=hasil*i;
			}
			System.out.print(hasil);
		}
		System.out.println();
	}
}


