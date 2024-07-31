import java.util.Scanner;
public class KonversiSuhu{
public static void main(String args[]){

	double cel = 20;
	do{
		System.out.println(" celcius      farenheit ");
		System.out.println("=========================");
		double far = (cel*9/5)+32;
		System.out.println(" "+cel+"         "+far+" ");
		cel++;
		}
		while (cel<=30);
}
}