public class TugasMod11 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5) {
            int baris = 1;
            while (baris <= i) {
                System.out.print(baris + " ");
                baris++;
            }
            System.out.println();
            i++;
        }

        i = 4;
        while (i >= 1) {
            int baris = 1;
            while (baris <= i) {
                System.out.print(baris + " ");
                baris++;
            }
            System.out.println();
            i--;
        }
    }
}