import java.util.Scanner;
public class Latihan_3 {
public static void main(String args[]) {
	Scanner masuk = new Scanner(System.in);
	int pil, total, i;
	System.out.println(" Masukan pinjaman");
	System.out.println(" 1. Pembelian kredit");
	System.out.println(" 2. Pembelian tunai");
	System.out.print(" pilihan : ");
	pil=masuk.nextInt();
	System.out.print("total pembelian : ");
	total=masuk.nextInt();
	   if (pil == 1) {
		   if (total >=1000000){
			i=1;
			while (i<=10) {
			System.out.println("Angsuran ke ="+i+"sebesar "+(total/10));
			i++; 
			}
		   }
		   else{
			i=1;
			while (i<=5) {
			System.out.println("Angsuran ke ="+i+"sebesar "+(total/5));
			i++; 
			}
		  }
	  }
	  else if(pil==2){
                  System.out.println("Anda melakukan pembelian tunai");
          }
   }
}
