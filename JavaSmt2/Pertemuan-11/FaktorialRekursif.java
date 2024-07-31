public class FaktorialRekursif{
	//method rekursif
	public static long faktorial( long N ){
		if ( N <= 1 ) // kondisi terpenuhi untuk akhir rekursif
			return 1; // nilai akhir: 0! = 1 dan 1! = 1
		else // step rekursif, ada pemanggilan kembali method 'faktorial'
			return N * faktorial( N - 1 );
	}

	public static void main( String[] args ){
 		// pemanggilan awal method faktorial
 		System.out.println( "Faktorial 5 = "+ faktorial(5));
 	}
 }
