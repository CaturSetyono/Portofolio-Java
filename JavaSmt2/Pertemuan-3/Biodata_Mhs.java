import java.util.Scanner;
public class Biodata_Mhs {
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  String nama, nim, jenisKelamin, alamat, nope, def="Masukan ";
        System.out.println("================================");
        System.out.println("|   INPUT BIODATA MAHASISWA    |");
        System.out.println("================================");
        System.out.print(def + "Nama \t\t: " );
        nama = input.nextLine();
        System.out.print(def + "NIM \t\t: " );
        nim = input.nextLine();
        System.out.print(def + "Jenis Kelamin \t: " );
        jenisKelamin = input.nextLine();
        System.out.print(def + "Alamat \t\t: " );
        alamat = input.nextLine();
        System.out.print(def + "Nomor Handphone\t: " );
        nope = input.nextLine();
        System.out.println("");
        System.out.println("+------------------------------+");
        System.out.println("|    Data Biodata Mahasiswa    |");
        System.out.println("+------------------------------+");
        System.out.println("| Nama\t\t: " + nama);
        System.out.println("| NIM\t\t: " + nim);
        System.out.println("| Jenis Kelamin\t: " + jenisKelamin);
        System.out.println("| Alamat\t: " + alamat);
        System.out.println("| Nomor HP\t: " + nope);
        System.out.println("+-------------------------------+");
    }
}
