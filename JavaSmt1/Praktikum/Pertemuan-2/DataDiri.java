import java.util.Scanner;
public class DataDiri{
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String NIM,nama,tempatLahir,tanggalLahir,noHP,email,jurusan, alamat;
	int usia;
	System.out.print("Masukkan NIM: ");
	NIM = input.next();
	System.out.print("Masukkan Nama: ");
	nama = input.next();
	System.out.print("Masukkan Tempat Lahir: ");
	tempatLahir = input.next();
	System.out.print("Masukkan Usia: ");
	usia = input.nextInt();
	System.out.print("Masukkan Tanggal Lahir: ");
	tanggalLahir = input.next();
	System.out.print("Masukkan Nomor HP: ");
	noHP = input.next();
	System.out.print("Masukkan E-mail: ");
	email = input.next();
	System.out.print("Masukkan Jurusan: ");
	jurusan = input.next();
	System.out.print("Masukkan Alamat: ");
	alamat = input.next();
	System.out.println("NIM: " + NIM);
	System.out.println("Nama: " + nama);
	System.out.println("Tempat Lahir: " + tempatLahir);
	System.out.println("Tanggal Lahir: " + tanggalLahir);
	System.out.println("Usia: " + usia + " tahun");
	System.out.println("Nomor HP: " + noHP);
	System.out.println("E-mail: " + email);
	System.out.println("Jurusan: " + jurusan);
	System.out.println("Alamat: " + alamat);
}
}
