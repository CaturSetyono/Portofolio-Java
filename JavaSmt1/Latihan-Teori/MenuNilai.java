import java.util.Scanner;
public class MenuNilai{
public static void main(String[] args){
//deklarasi variabel
int n=0;
String[] nama=new String[100];
int[]  nilai = new int[100];
Scanner input = new Scanner(System.in);
//input do while
int i=0;
int tNilai=0;
double ratarata=0.0;
int iMax=0;
int max=0;
int pilih=1;
do{
   System.out.println("**MENU**");
   System.out.println();
   System.out.println("1. Input Nilai Siswa");
   System.out.println("2. Informasi nilai Rata-rata");
   System.out.println("3. Informasi nilai Nilai Tertinggi");
   System.out.println("4. Informasi Daftar nilai Siswa");
   System.out.println("5. Keluar" );
   System.out.print("Masukan nomor pilihan (1-5)?");
   pilih = input.nextInt();
   if (pilih == 1){
      System.out.print("Masukan nama = ");
      nama[n]=input.next();
      System.out.print("Masukan Nilai = ");
      nilai[n]=input.nextInt();
      System.out.println();
      n++;
   }
   else if (pilih == 2){
      //menghitung nilai rata-rata kelas
      i=0;
      tNilai=0;
      ratarata=0.0;
      while(i<n){
        tNilai = tNilai + nilai[i];
        i++;
      }
     ratarata=tNilai/n;
     System.out.println ("Rata-rata nilai Siswa = "+ratarata);
   }
   else if (pilih==3){
      //Mencari siswa nilai tertinggi
      i=0;
      max=0;
      do{
      if(max<nilai[i]) {
          iMax = i;
      }
      i++;
      }while(i<n);
      System.out.println ("Nilai Tertinggi= "+nilai[iMax]);
      System.out.println ("Siswa Nilai Tertinggi= "+nama[iMax]);
      System.out.println ("Index Siswa Nilai tertinggi= "+iMax);
   }
   else if(pilih ==4){
      //output
      System.out.println("Daftar Nilai Siswa");
      System.out.println("====================");
      System.out.println ();
      System.out.println (" Nama      Nilai ");
      System.out.println ("==================");
      for(i=0;i<n;i++){
         System.out.println (nama[i]+"\t" + nilai[i]);
      }
      System.out.println ("==================");
      System.out.println ("Rata-rata nilai Siswa = "+ratarata);
      System.out.println ("Nilai Tertinggi= "+nilai[iMax]);
      System.out.println ("Siswa Nilai Tertinggi= "+nama[iMax]);
   }
   else {
   pilih =5;
   System.out.println("Selesai" );
   } while (pilih!=5);

  }
 }
}