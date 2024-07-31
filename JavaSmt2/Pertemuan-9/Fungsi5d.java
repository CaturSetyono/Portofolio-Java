public class Fungsi5d{
	public int jumlah(int a, int b, int c){
		System.out.println(" a = "+a+" dan b = "+b+" dan c = "+c); //no. 1
		c = a + b; //
		a = b + c; //
		b = c + a; //
		System.out.println(" a = "+a+" dan b = "+b+" dan c = "+c); //no. 2
		return (a + b + c);
	}
	public static void main(String args[]){
		Fungsi5d obyek = new Fungsi5d();
		int a, b,c;
		a = 12; b = 13; c = 14;
		System.out.println("Panggil method jumlah dengan parameter a dan b");
		System.out.println("jumlah = "+obyek.jumlah(a, b, c)); //no. 3
		System.out.println(" a = "+a+" dan b = "+b+" dan c = "+c); //no. 4
		System.out.println("jumlah = "+obyek.jumlah(b, c, a)); //no. 5
		System.out.println(" a = "+a+" dan b = "+b+" dan c = "+c); //no. 6
	}
}
