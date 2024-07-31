import java.util.Scanner;
public class Kendaraan{
	public static void main(String[]args){
		Scanner input= new Scanner(System.in);
		System.out.println("----------------------");
		System.out.println("Pilih Jenis Kendaraan");
		System.out.println("----------------------");
		System.out.println("1.Mobil");
		System.out.println("2.Motor");
		System.out.println("----------------------");
		System.out.print("Masukan Pilihan Anda : ");
		int pilih = input.nextInt();
		//ini seleksi percabangan if-else if untuk jenis kendaraan
		if(pilih==1){
			System.out.println("----------------------");
			System.out.println("Pilih Merek Mobil");
			System.out.println("----------------------");
			System.out.println("1.Honda");
			System.out.println("2.Suzuki");
			System.out.println("----------------------");
			System.out.print("Masukan Pilihan Anda : ");
			int merekMbl = input.nextInt();
	//ini seleksi percabangan if-else if untuk merek mobil
			if(merekMbl==1){
				String	Jazz = " 170 JT";
				String	Brio = "120 JT";
				String	Mobilio = "170 JT";

				System.out.println("----------------------");
				System.out.println("Pilih Unit Mobil");
				System.out.println("----------------------");
				System.out.println("- Jazz");
				System.out.println("- Brio");
				System.out.println("- Mobilio");
				System.out.println("----------------------");
				System.out.print("Masukan Pilihan Anda : ");
				String unit = input.next();
	//ini seleksi percabangan switch untuk menentukan unit
				switch(unit){
				case "Jazz":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Jazz);
				break;
				case "Brio":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Brio);
				break;
				case "Mobilio":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Mobilio);
				break;
				case "jazz":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Jazz);
				break;
				case "brio":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Brio);
				break;
				case "mobilio":
					System.out.println("----------------------");
					System.out.println("Harga Mobil Honda "+unit+" : "+Mobilio);
				break;
				default:
					System.out.println("Input Salah");
				break;
				}
			}//merekMbl 1
			else if(merekMbl==2){
				String APV = "180 JT";
				String Swift = "155 jt";
				String Ertiga = "160 jt";

				System.out.println("----------------------");
				System.out.println("Pilih Unit Mobil");
				System.out.println("----------------------");
				System.out.println("- APV");
				System.out.println("- Swift");
				System.out.println("- Ertiga");
				System.out.println("----------------------");
				System.out.print("Masukan Pilihan Anda : ");
				String unit = input.next();
				if ((unit.equals("APV"))||(unit.equals("apv"))){
					System.out.println("----------------------");
					System.out.println("Harga Mobil Suzuki "+unit+" : "+APV);
				}
				else if((unit.equals("Swift"))||(unit.equals("swift"))){
					System.out.println("----------------------");
					System.out.println("Harga Mobil Suzuki "+unit+" : "+Swift);
				}
				else if((unit.equals("Ertiga"))||(unit.equals("Ertiga"))){
					System.out.println("----------------------");
					System.out.println("Harga Mobil Suzuki "+unit+" : "+Ertiga);
				}
				else
					System.out.println("Input Salah");
				}//merekMbl 2
		}// pilih 1
		else if(pilih==2){
			System.out.println("----------------------");
			System.out.println("Pilih Merek Motor");
			System.out.println("----------------------");
			System.out.println("1.Honda");
			System.out.println("2.Yamaha");
			System.out.println("----------------------");
			System.out.print("Masukan Pilihan Anda : ");
			int merekMtr = input.nextInt();
			if(merekMtr==1){
				String	Vario ="15 JT";
				String	Supra = "12 JT";

				System.out.println("----------------------");
				System.out.println("Pilih Unit Motor");
				System.out.println("----------------------");
				System.out.println("- Vario");
				System.out.println("- Supra");
				System.out.println("----------------------");
				System.out.print("Masukan Pilihan Anda : ");
				String unit = input.next();
					if ((unit.equals("Vario"))||(unit.equals("vario"))){
						System.out.println("----------------------");
						System.out.println("Harga Motor Honda "+unit+" : "+Vario);
						}
					else if((unit.equals("Supra"))||(unit.equals("supra"))){
						System.out.println("----------------------");
						System.out.println("Harga Motor Honda "+unit+" : "+Supra);
						}
					else
						System.out.println("Input Salah");
			}//merekMtr 1
			else if(merekMtr==2){
				String Mio ="14 JT";
				String Vixion ="20 JT";

				System.out.println("----------------------");
				System.out.println("Pilih Unit Motor");
				System.out.println("----------------------");
				System.out.println("- Mio");
				System.out.println("- Vixion");
				System.out.println("----------------------");
				System.out.print("Masukan Pilihan Anda : ");
				String unit = input.next();
					if ((unit.equals("Mio"))||(unit.equals("mio"))){
						System.out.println("----------------------");
						System.out.println("Harga Motor Yamaha "+unit+" : "+Mio);
						}
					else if((unit.equals("Vixion"))||(unit.equals("vixion"))){
						System.out.println("----------------------");
						System.out.println("Harga Motor Yamaha "+unit+" : "+Vixion);
						}
					else
						System.out.println("Input Salah");
			}
		}//pilih 2
		else
			System.out.println("Input Salah");
	}//main
}//class