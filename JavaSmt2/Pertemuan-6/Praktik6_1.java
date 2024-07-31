import java.util.Scanner;
public class Praktik6_1 {
public static void main(String args[]) {
	Scanner masuk = new Scanner(System.in);
	int nilai, i;
	System.out.println(" Masukan pilihan");
	System.out.println(" 1. bil ganjil");
	System.out.println(" 2. bil genap");
	System.out.print(" pilihan : ");
	nilai=masuk.nextInt();
	   if (nilai == 1) {
		for (i=1; i<=10; i+=2) {
		  System.out.println(i);
		}
	   }
	   else {
		for (i=0; i<=10; i+=2) {
		  System.out.println(i);
		}
	   }
}
}
