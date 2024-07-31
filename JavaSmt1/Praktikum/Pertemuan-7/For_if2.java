import java.util.Scanner;
	public class For_if2{
	public static void main(String args[]) {
		Scanner masuk = new Scanner(System.in);
		int nilai, i;
		System.out.print("Masukan angka bulat : ");
		nilai = masuk.nextInt();

		if (nilai>5) {
		  for (i=nilai; i>=1; i--) {
		    System.out.print(i);
		  }
		}
		else {
		  for (i=nilai; i<=10; i++) {
		    System.out.print(i);
		  }
		}
	 }
	}
