public class MatriksTranspose {
    public static void main(String[] args) {
    int[][] matriks = {{12,23,32},{34,56,63},{78,89,97}};
        int j,k;
   	System.out.println("Matriks Sebelum Transpose ");
        for(j=0;j<3;j++){
            for(k=0;k<3;k++){
                System.out.print(matriks[j][k]+" ");
            }
            System.out.println();
        }    
	System.out.println("\nMatriks Setelah Transpose");
        for(j=0;j<3;j++){
            for(k=0;k<3;k++){
                System.out.print(matriks[k][j]+" ");
            }
            System.out.println();
        }        
    }
}
