public class FaktorialMod {
    //method rekursif
    public static long faktorial(long N) {
        if (N <= 1) {
            System.out.println("Faktorial 1 = 1");
            return 1; // nilai akhir: 0! = 1 dan 1! = 1
        } else {
            long hasil = N * faktorial(N - 1);
            System.out.println("Faktorial " + N + " = " + hasil);
            return hasil;
        }
    }

    public static void main(String[] args) {
        // pemanggilan awal method faktorial
        faktorial(5);
    }
}
