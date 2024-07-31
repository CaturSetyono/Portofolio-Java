import java.util.Scanner;
public class TampilkanAKAKOM {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Masukan Banyak Tulisan : ");
	int Btulisan = input.nextInt();
	int i = 1;
	do {
	System.out.println(i+" ---STMIK AKAKOM--- "); i++;
	}
	while(i<=Btulisan);
}
}