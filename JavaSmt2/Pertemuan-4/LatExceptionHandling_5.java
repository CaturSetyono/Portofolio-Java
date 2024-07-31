import java.util.Scanner;
public class LatExceptionHandling_5 {
	public static void main(String[] args){
		try{
        int b=3;int d=3; //matrik 3 baris 3 kolom
        System.out.println("Masukan Nilai Matrix:");
        int[][] matrix1=new int[b][d];
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                matrix1[i][j]=input();
            }
        }
        for(int i=0;i<b;i++){
            for(int j=0;j<d;j++){
                System.out.print(matrix1[i][j]+" ");
            }
            System.out.println();
        }
	}catch(Exception indexOutOfBoundsException){
	   System.err.printf( "\nException: %s\n",indexOutOfBoundsException);
	   System.out.println("404 ---- Program Error");
	 }
 }
    static int input(){
        Scanner a=new Scanner(System.in);
        int b=a.nextInt();
        return b;
    }
}
