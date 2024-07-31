public class Method5{
	public int jumlah(){
		int a = 8, b = 10;
		return (a + b);
	}

	public static void main(String args[]){
		Method5 obyek = new Method5();
		System.out.println("Hasil pemanggilan method jumlah");
		System.out.println(obyek.jumlah());
	}
}
