import java.util.Scanner;
public class TugasMod10_2{
public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukan Bilangan Awal : ");
		int bA = input.nextInt();
		System.out.print("Masukan Bilangan Akhir : ");
		int bAk = input.nextInt();
		int jumlah =0;
		for (int i=bA;i<=bAk;i++){
			if(i%5==0){
		System.out.println("#"+i);
		jumlah += i;}

		}
		System.out.println("Jumlah Deret : "+jumlah);
	}
}