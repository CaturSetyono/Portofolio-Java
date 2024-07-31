import java.util.Scanner;
public class JumlahHari{
	public static void main(String[]args){

		Scanner input= new Scanner(System.in);
		System.out.print("Masukan Jumlah Hari Dalam 1 Tahun (365/366) : ");
		int setahun = input.nextInt();
		System.out.print("Masukan Bulan : ");
		int bulan = input.nextInt();

			switch(bulan){
				case 1,3,5,7,8,10,12:
					System.out.println("Jumlah Hari Bulan "+bulan+" = 31 Hari");
				break;
				case 4,6,9,11:
					System.out.println("Jumlah Hari Bulan "+bulan+" = 30 Hari");
				break;
				case 2:
					if(setahun%2==0)
						System.out.println("Jumlah Hari Bulan "+bulan+" = 29 Hari");
					else
						System.out.println("Jumlah Hari Bulan "+bulan+" = 28 Hari");
				break;
		}
	}
}