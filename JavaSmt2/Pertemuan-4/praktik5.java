import java.util.Scanner;
public class praktik5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] x = {{1, 2, 3}, {4, 5, 6}};
        int[][] y = {{3, 6, 1}, {4, 7, 9}};
        int baris = 2;
        int kolom = 3;
        System.out.println("Matrix x:");
        printMatrix(x);
        System.out.println("Matrix y:");
        printMatrix(y);
        // Addition of matrices
        int[][] sum = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                sum[i][j] = x[i][j] + y[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        // Subtraction of matrices
        int[][] difference = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                difference[i][j] = x[i][j] - y[i][j];
            }
        }
        System.out.println("Difference of matrices:");
        printMatrix(difference);
    }
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
