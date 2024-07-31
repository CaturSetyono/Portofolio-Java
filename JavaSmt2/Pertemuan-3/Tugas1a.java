public class Tugas1a{
	public static void main(String[]args){

	System.out.println("---------------------------------------");
	System.out.println("| Bilangan | Pangkat  | Hasil Pangkat |");
	System.out.println("---------------------------------------");
		for(int i=1;i<=10;i++){
			long hp=1;
			for(int p=1;p<=i;p++){
				hp*=i;
			}
			System.out.println("     "+i+"	  	"+i+"\t  	"+(hp));
		}
	}
}