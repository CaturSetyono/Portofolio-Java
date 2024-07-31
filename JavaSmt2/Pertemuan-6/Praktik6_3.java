import java.util.Scanner;
public class Praktik6_3 {
public static void main(String args[]) {
	Scanner masuk = new Scanner(System.in);
	int pil, total, i;
	System.out.println("Masukan pinjaman");
	System.out.println("1. Pembelian kredit");
	System.out.println("2. Pembelian tunai");
	System.out.print("pilihan : ");
	pil=masuk.nextInt();
	System.out.print("total pembelian : ");
	total=masuk.nextInt();
	   if (pil == 1) {
		   if (total >=1000000){
			   for (i=1; i<=10; i++) {
		   System.out.println("Angsuran ke =" +i+ "sebesar "+(total/10));
		}}
		else{
			for (i=1; i<=5; i++) {
		  System.out.println("Angsuran ke =" +i+ "sebesar "+(total/5));
		  }
	  }
	}
	   else if(pil==2){
				if(total >= 1000000){
				  System.out.println("Anda melakukan pembelian tunai");
				  double bayar = total - (0.05*total);
				  System.out.println("total bayar = "+bayar);
				  }
				  else
				  {
					  System.out.println("Anda melakukan pembelian tunai dan tidak mendapatkan diskon");
					  System.out.println("Total yang harus dibayar "+total);
				  }
		}
   }
}
