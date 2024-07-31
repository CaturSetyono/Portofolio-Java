public class FibonacciRekursif{
	//method rekursif
	public static long fibonacci( long N ){
		if (( N == 0 ) || ( N == 1 )) // kondisi terpenuhi untuk akhir rekursif
			return N; // nilai akhir : N=0 atau N=1
		else // step rekursif, ada pemanggilan kembali method 'fibonacci'
			return fibonacci(N-1) + fibonacci(N-2);
	}

	public static void main( String[] args ){
		System.out.println("Deret fibonacci dengan N = 3");
		for (int i=0; i<=3;i++)
 			// pemanggilan awal method fibonacci
 			if (i<3)
 				System.out.print(fibonacci(i)+", ");
 			else
 				System.out.println(fibonacci(i));
 	}
 }
