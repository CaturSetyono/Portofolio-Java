
import java.util.Scanner;
public class UlangForLat2{
public static void main (String[]  args){
	Scanner input = new Scanner(System.in);
	System.out.println ("Masukan Bilangan Awal = ");
	int bAwal = input.nextInt();
	System.out.println ("Masukan Bilangan Akhir = ");
	int bAkhir = input.nextInt();
	for(bAwal<=bAkhir;bAwal += 5){
	System.out.print(bAwal);}
}
}