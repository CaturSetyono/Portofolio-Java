import java.util.Scanner;
public class nilai{
public static void main (String arg[]){
   Scanner in=new Scanner(System.in);
   int nilai;
   String masuk;
 do{
	   System.out.println("Masukkan angka bulat (0 - 100) ");
	   nilai=in.nextInt();
	   if (nilai>=60){
		   if (nilai>=80)
             System.out.println("Nilaimu bagus sekali ");
		   else
			 System.out.println("Nilaimu bagus ");
	   }
	   else {
		   if (nilai>=30)
			 System.out.println("Nilaimu kurang ");
		   else
			 System.out.println("Nilaimu jelek ");
	   }
	   System.out.println("Ingin masukan nilai lain? ya/tidak");
	   masuk=in.next();
   }while(masuk.equals("ya"));
}
}
