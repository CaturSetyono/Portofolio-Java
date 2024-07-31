import java.util.Scanner;
public class lat2 {
public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	boolean run = true;
	do {
	System.out.println(" ---STMIK AKAKOM--- ");
	System.out.println("Ketik y/n : ");
	String jawab = input.nextLine();
	run = jawab.equalsIgnoreCase("y");
	}
	while(run);

}

}