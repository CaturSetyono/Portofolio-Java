public class LatExceptionHandling_1 {
public static void main(String[] args) {
	String cats[][]= {{"terry","brown"},
			          {"kitty","white"},
			          {"toby","gray"},
	                  {"fido","black"}};
	System.out.println("Nama Kucing\tWarna");
	try{
	   System.out.println(cats[0][0] + "\t\t" + cats[0][1]);
	   System.out.println(cats[1][0] + "\t\t" + cats[1][1]);
	   System.out.println(cats[2][0] + "\t\t" + cats[2][1]);
	   System.out.println(cats[3][0] + "\t\t" + cats[3][1]);
	}catch(IndexOutOfBoundsException e){
	   System.out.println("Index Error : ");
		}
}
}
