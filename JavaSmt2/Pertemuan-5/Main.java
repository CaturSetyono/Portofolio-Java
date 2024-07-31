public class Main{

    public static void main(String[] args) {
        int[][][] array3D = new int[2][4][3];

        // Mengisi array 3D dengan nilai
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    array3D[i][j][k] = (i + j + k) % 2;
                }
            }
        }

        // Mencetak array 3D
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {
                    System.out.print(array3D[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}
