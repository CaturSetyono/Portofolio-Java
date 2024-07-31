public class Fungsi5a{
	public float jumlah(int a, float b){
		System.out.println(" a = "+a+" dan b = "+b); // 1.
		a = 12;
		b = 14.5f;
		System.out.println(" a = "+a+" dan b = "+b); // 2.
		return (a + b);
	}
	public static void main(String args[]){
		Fungsi5a obyek = new Fungsi5a();
		int a; float b;
		a = 17;
		b = 12.3f;
		System.out.println("Panggil method jumlah dengan parameter a dan b");
		System.out.println(obyek.jumlah(a, b)); // 3.
		System.out.println(" a = "+a+" dan b = "+b);  // 4.
	}
}