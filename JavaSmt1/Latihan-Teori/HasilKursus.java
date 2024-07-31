import java.util.Scanner;
 public class HasilKursus{
 public static void main(String[]args){
 	Scanner msk = new Scanner(System.in);

 	//jumlah lulus dan gagal
 	int jLulus = 0;
 	int jGagal = 0;

 	for (int i = 1;i<=8;i++){
		System.out.print("Masukan Hasil Ujian <1 =lulus atau 2 = gagal> : ");
 	    int jawab = msk.nextInt();
		if(jawab==1){
			jLulus += 1;
			}
		else{
			jGagal += 1;
			}
		}
		System.out.println("Lulus = "+jLulus);
		System.out.println("Gagal = "+jGagal);
		if(jLulus>4){
			System.out.println("Kusrsus Telah Berhasil");}
 }
 }