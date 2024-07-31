import java.util.Scanner;
public class MataKuliah {
	public static void main(String[]args){
	Scanner in = new Scanner(System.in);
	String matkul;
	int sks;
	int tSks = 0;
	String masuk;
		do{
			System.out.print("Masukan Jenjang : ");
				String jen= in.next();
				if (jen.equals("D3")){
					for(int i=0;i<3;i++){
						System.out.print("Masukan Mata Kuliah : ");
						matkul = in.next();
						System.out.print("Masukan sks : ");
						sks = in.nextInt();
						tSks+=sks;
						}
						System.out.println("Jumlah SKS : "+tSks);
				}
				else if(jen.equals("S1")){
					for(int i=0;i<4;i++){
						System.out.print("Masukan Mata Kuliah : ");
						matkul = in.next();
						System.out.print("Masukan sks : ");
						sks = in.nextInt();
						tSks+=sks;
						}
						System.out.println("Total SKS : "+tSks);
				}
				System.out.print("Ingin Masukan Jenjang Lain (ya/tidak): ");
				masuk = in.next();
		}while (masuk.equals("ya"));
	}
}