public class Tugas1 {
    public static int pangkat(int A, int B) {
        if (A < 1 || B < 1) {
            throw new IllegalArgumentException("A dan B harus lebih besar atau sama dengan 1");
        }

        int hasil = 1;
        for (int i = 0; i < B; i++) {
            hasil *= A;
        }

        return hasil;
    }

    public static void main(String[] args) {
        int A = 2;
        int B = 3;
        int hasil = pangkat(A, B);
        System.out.println(A + "^" + B + " = " + hasil); 
    }
}
