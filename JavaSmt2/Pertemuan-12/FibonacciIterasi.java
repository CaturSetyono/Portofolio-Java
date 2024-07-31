public class FibonacciIterasi{

	public static void main( String[] args ){
		System.out.println("Deret fibonacci dengan N = 5");
		int fibn;
		int fibn1 = 1;
		int fibn2 = 0;
		for (int i=0; i<=5;i++)
			if (i==0 || i==1)
				System.out.print(i+ " ");

 			else {
				fibn = fibn1+fibn2;
				fibn2 = fibn1;
				fibn1 = fibn;
 				System.out.print(fibn+" ");
			}
 	}
}
