import java.util.Scanner;
public class UlangDo1 {
public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int bil;
	bil=1;
	do {
	System.out.println(bil);
	bil+=2;
	} while (bil<=10);
}
}