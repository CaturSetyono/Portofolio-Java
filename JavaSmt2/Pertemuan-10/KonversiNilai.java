import java.util.Scanner;

public class KonversiNilai {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char [] keluar = new char[10];
        for (int i=0;i<10;i++){
            System.out.print("data ke-"+(i+1)+":");
            data[i] = scan.nextDouble(); 
        }
       System.out.println("=====================");
       System.out.println("|   Hasil Konversi  |");
       System.out.println("=====================");
       keluar = konversiNilai(data);
        //tampil hasil
        for (int i=0;i<10;i++){
            System.out.println(data[i]+"  "+keluar[i]);
        }
                 }
      public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char hasil[] = new char[n];
        for (int i = 0; i < n; i++) {
            if ((x[i] > 80) && (x[i] <= 100)) {
                hasil[i] = 'A';
            } else if ((x[i] > 60) && (x[i] <= 80)) {
                hasil[i] = 'B';
            } else if ((x[i] > 40) && (x[i] <= 60)) {
                hasil[i] = 'C';
            } else if ((x[i] > 20) && (x[i] <= 40)) {
                hasil[i] = 'D';
            } else if (x[i] <= 20) {
                hasil[i] = 'E';
            }
        }
        return hasil;
    }
}
