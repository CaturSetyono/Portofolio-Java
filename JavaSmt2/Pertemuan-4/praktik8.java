import java.util.Scanner;

public class praktik8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendapatkan dimensi matriks
        System.out.print("Masukkan jumlah baris matriks pertama: ");
        int barisMatrix1 = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks pertama: ");
        int kolomMatrix1 = scanner.nextInt();

        System.out.print("Masukkan jumlah baris matriks kedua: ");
        int barisMatrix2 = scanner.nextInt();
        System.out.print("Masukkan jumlah kolom matriks kedua: ");
        int kolomMatrix2 = scanner.nextInt();

        // Pengecekan validasi perkalian matriks
        if (kolomMatrix1 != barisMatrix2) {
            System.out.println("Error: Perkalian matriks tidak dapat dilakukan karena jumlah kolom matriks pertama tidak sama dengan jumlah baris matriks kedua.");
            return;
        }

        // Meminta pengguna memasukkan elemen matriks
        System.out.println("Masukkan elemen matriks pertama:");
        int[][] matrix1 = inputMatrix(scanner, barisMatrix1, kolomMatrix1);

        System.out.println("Masukkan elemen matriks kedua:");
        int[][] matrix2 = inputMatrix(scanner, barisMatrix2, kolomMatrix2);

        // Menghasilkan matriks hasil perkalian
        int[][] hasilPerkalian = multiplyMatrix(matrix1, matrix2);
      	  System.out.println("Ini adalah Matriks 1 :");
				 for(int i=0;i<barisMatrix1;i++){
								for(int j=0;j<kolomMatrix1;j++){
									System.out.print(matrix1[i][j]+" ");
								}
								System.out.println();
						}
		  System.out.println("Ini adalah Matriks 2 :");
			     for(int i=0;i<barisMatrix2;i++){
				 	            for(int j=0;j<kolomMatrix2;j++){
				 	                System.out.print(matrix2[i][j]+" ");
				 	            }
				 	            System.out.println();
		        }
		 // Menampilkan matriks hasil perkalian
		         System.out.println("Hasil perkalian matriks:");
        		 printMatrix(hasilPerkalian);

    }

    // Fungsi untuk meminta pengguna memasukkan elemen matriks
    public static int[][] inputMatrix(Scanner scanner, int baris, int kolom) {
        int[][] matrix = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("Masukkan elemen [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    // Fungsi untuk mengalikan matriks
    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int barisHasil = matrix1.length;
        int kolomHasil = matrix2[0].length;
        int[][] hasilPerkalian = new int[barisHasil][kolomHasil];

        for (int i = 0; i < barisHasil; i++) {
            for (int j = 0; j < kolomHasil; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    hasilPerkalian[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return hasilPerkalian;
    }
    // Fungsi untuk menampilkan matriks
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
