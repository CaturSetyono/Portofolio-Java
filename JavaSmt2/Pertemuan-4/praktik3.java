import java.util.Scanner;
public class praktik3{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String cats[][]=new String[4][2];
		for(int i=0;i<4;i++){
			System.out.print("Masukan Nama Kucing "+(i+1)+": ");
			cats[i][0]= input.next();
			System.out.print("Masukan warna Kucing "+(i+1)+": ");
			cats[i][1]= input.next();}

		System.out.println("Nama Kucing\tWarna");
		for (int i=0;i<cats.length;i++) {
		for (int j=0;j<cats[i].length;j++) {
		System.out.print(cats[i][j]);
		System.out.print("\t\t");
		}
		System.out.println(" ");
		}
}
}