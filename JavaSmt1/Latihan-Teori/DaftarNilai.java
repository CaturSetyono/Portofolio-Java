import java.util.Scanner;
public class DaftarNilai{
public static void main(String[] args){
		//deklarasi variabel
		Scanner input = new Scanner(System.in);
		int jSiswa = 2;
		boolean lagi = true;

		String[] nama=new String[100];
		int[]  nilai = new int[100];

			//input do while
					int i=0;
					do{
					   System.out.print("Masukan nama               = ");
					   nama[i]=input.next();
					   System.out.print("Masukan Nilai              = ");
					   nilai[i]=input.nextInt();
					   System.out.println();
					   i++;
					} while (i<jSiswa);
					//menghitung nilai rata-rata kelas
					i=0;
					int tNilai=0;
					double ratarata=0.0;
					while(i<jSiswa){
					tNilai = tNilai + nilai[i];
					i++;
					}
					ratarata=tNilai/jSiswa;

					//Mencari siswa nilai tertinggi
					int iMax=0;
					int max = nilai[0];
					String nmMax=nama[0];
					i=1;
					do{
						if(max<nilai[i]) {
							iMax = i;
							max  = nilai[i];
							nmMax = nama[i];
					   }
					   i++;
		}while(i<jSiswa);

			while(lagi){

					System.out.println("=============MENU===============");
					System.out.println("================================");
					System.out.println("1. Input Nilai Siswa ");
					System.out.println("2. Informasi Nilai Rata-Rata");
					System.out.println("3. Informasi Nilai Tertinggi");
					System.out.println("4. Informasi Daftar Nilai ");
					System.out.println("5. Keluar");
					System.out.println("================================");
					System.out.print("Masukan Pilihan   (1-5)    = ");
		            int pil = input.nextInt();

		            switch(pil){
								case 1:
								do{
								System.out.print("Masukan nama               = ");
								nama[i]=input.next();
								System.out.print("Masukan Nilai              = ");

								nilai[i]=input.nextInt();
								System.out.println();
								i++;
								  } while (i<jSiswa);
									;
								break;

								case 2:
								System.out.println ("Rata-rata nilai Siswa   = "+ratarata);;
								break;

								case 3:
								System.out.println ("Nilai Tertinggi         = "+max);;
								break;

								case 4:
								System.out.println("Daftar Nilai Siswa");
								System.out.println("=================================");
								System.out.println ();
								System.out.println ("No         Nama          Nilai ");
								System.out.println("=================================");
								for(i=0;i<jSiswa;i++){
								System.out.println ((i+1)+"           "+ nama[i]+"           "+ nilai[i]);
								}
								System.out.println("=================================");
								break;
								case 5:
								lagi = false;

								;
								break;


								}
			}
			}
		}