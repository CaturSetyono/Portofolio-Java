public class LatExceptionHandling_2 {
public static void main(String[] args) {
	String cats[][]= {{"terry","brown"},
	{"kitty","white"},
	{"toby","gray"},
	{"fido","black"}};
	System.out.println("Nama Kucing\tWarna");
	try{
		for (int i=0;i<cats.length;i++) {
			for (int j=0;j<cats[i].length;j++) {
				System.out.print(cats[i][j]);
				System.out.print("\t");
			}
				System.out.println(" ");
		}
	}catch(IndexOutOfBoundsException indexOutOfBoundsException){
	   System.err.printf( "\nException: %s\n",indexOutOfBoundsException);
	   System.out.println("404 ---- Program Error");
	 }
}
}
