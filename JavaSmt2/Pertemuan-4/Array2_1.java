public class Array2_1{
public static void main(String[] args) {
	String cats[][]= {{"terry","brown"},
	{"kitty","white"},
	{"toby","gray"},
	{"fido","black"}};
	System.out.println("Nama Kucing\tWarna");
	for (int i=0;i<cats.length;i++) {
	for (int j=0;j<cats[i].length;j++) {
	System.out.print(cats[i][j]);
	System.out.print("\t");
	}
	System.out.println(" ");
	}
}
}
