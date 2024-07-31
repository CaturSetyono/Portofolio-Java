import java.util.Scanner;
public class Kasir {
public static void main(String[]args){

	Scanner input = new Scanner(System.in);
	String loop;
	int TB = 0;
	do{
		System.out.print(" Hitung Belanja [y/t] = ");
		loop = input.next();

		if (loop.equals("y")){
			System.out.print("Masukan Jumlah Jenis Barang = ");
			int JJB = input.nextInt();
			for (int i = 1; i <= JJB; i++){
				System.out.print("Harga barang ke-"+i+" = ");
				int HB = input.nextInt();
				System.out.print("Jumlah Barang = ");
				int JB = input.nextInt();

				TB += HB * JB;
				if(TB>=1000){
					double disc = TB * 0.1;
					int tb = TB - disc;
					System.out.println("total belanja = "+tb);
					}
				}
			System.out.println("total belanja = "+TB);
			}
	}while(!loop.equals("t") && !loop.equals("T"));
}
}
