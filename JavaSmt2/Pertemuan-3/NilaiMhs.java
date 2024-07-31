import java.util.Scanner;
public class NilaiMhs {
public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  int jumlahMK;
  float rataNilai[] = new float[5];
  float nilaiUts[] = new float[5];
  float nilaiUas[] = new float[5];
  String[] matKul = new String[5];
  String nama, nim, jurusan, def="Masukan ";
        System.out.println("================================");
        System.out.println("   Menghitung Nilai Mahasiswa   ");
        System.out.println("================================");
        System.out.print("  "+def+"Jumlah mata Kuliah : ");
        jumlahMK = input.nextInt();
        System.out.println("================================");
        System.out.print("Nama \t\t: " );
        nama = input.next();
        System.out.print("NIM \t\t: " );
        nim = input.next();
        System.out.print("Jurusan \t: " );
        jurusan = input.next();
        System.out.println("================================");
        System.out.println();
        System.out.println();

        for (int i =1; i<=jumlahMK;i++){
			System.out.print("Mata Kuliah ke-"+i+" :");
			matKul [i]= input.next();
			System.out.print("Nilai UTS :");
			nilaiUts [i]= input.nextFloat();
			System.out.print("Nilai UAS :");
			nilaiUas [i]= input.nextFloat();
			System.out.println();
			rataNilai [i]=((nilaiUts[i]+nilaiUas[i])/2);
			}

		System.out.println("================================");
		System.out.print("Nama : "+nama+"\t"+"NIM : "+nim);
		System.out.println();
		System.out.println("================================");
		System.out.print("Mata Kuliah \t"+"Nilai"+"\t Grade");
		System.out.println();
		System.out.println("================================");
		for(int i = 1;i<=
		jumlahMK;i++){
			System.out.println();
			System.out.println(matKul[i]+"\t\t"+rataNilai[i]+"\t B");
			}
    }
}
