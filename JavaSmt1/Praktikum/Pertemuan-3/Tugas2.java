import java.util.Scanner;
public class Tugas2{
public static void main(String[]args){
Scanner input = new Scanner(System.in);
System.out.println("Membuat Deret Bilangan");
	 System.out.println("=======================");
	 System.out.print("Masukan Banyak Data = ");
	 int n = input.nextInt();
     int i = 1;
	        do {
	            int hasil = i * i;
	            System.out.print(hasil + " ");
	            i++;
	           } while (i <= n);
	}
}
