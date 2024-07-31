public class Fungsi5c{
	public int jumlah(int a, int b){
		System.out.println(" a = "+a+" dan b = "+b); //1.
		a = 32;
		b = 28;
		System.out.println(" a = "+a+" dan b = "+b); //2.
		return (a + b);
	}

	public static void main(String args[]){
		Fungsi5c obyek = new Fungsi5c();
		int a, b;
		a = 41;
		b = 57;
		System.out.println("Panggil method jumlah dengan parameter a dan b");
		System.out.println("jumlah = "+obyek.jumlah(b, a)); //3.
		System.out.println(" a = "+a+" dan b = "+b); //4.
	}
}
