class dataPribadi {
	String nama,jKelamin,alamat;
	int nik,umur;

	//constructor
	dataPribadi(int nik,String nama,String jKelamin,String alamat,int umur){
		this.nik = nik;
		this.nama = nama;
		this.jKelamin = jKelamin;
		this.alamat = alamat;
		this.umur = umur;
		}
	void show() {
		System.out.println("+--------------------------+");
		System.out.println("|   Data Pribadi Anda      |");
		System.out.println("+--------------------------+");
		System.out.println("|NIK  : "+this.nik);
		System.out.println("|Nama : "+this.nama);
		System.out.println("|Jenis Kelamin : "+this.jKelamin);
		System.out.println("|Alamat : "+this.alamat);
		System.out.println("|Umur : "+this.umur);
		System.out.println("+--------------------------+");
		}

}
public class Main {
	public static void main(String[]args){
		dataPribadi data1 = new dataPribadi(330512345,"Catur","Pria","Bantul",23);
		data1.show();
	}
}