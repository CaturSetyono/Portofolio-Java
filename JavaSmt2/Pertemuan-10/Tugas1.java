import java.util.Scanner;

public class Tugas1{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] data = new double[10];
        char[] keluar = new char[10];
        int i = 0;
        
        while (i < 10) {
            System.out.print("data ke-" + (i + 1) + ": ");
            data[i] = scan.nextDouble();
            i++;
        }

        System.out.println("=====================");
        System.out.println("|   Hasil Konversi  |");
        System.out.println("=====================");

        keluar = konversiNilai(data);

        // Display results
        i = 0;
        while (i < 10) {
            System.out.println(data[i] + "  " + keluar[i]);
            i++;
        }
    }

    public static char[] konversiNilai(double[] x) {
        int n = x.length;
        char[] hasil = new char[n];
        int i = 0;
        
        while (i < n) {
            int category = (int) x[i] / 20;
            switch (category) {
                case 5:
                case 4:
                    hasil[i] = 'A';
                    break;
                case 3:
                    hasil[i] = 'B';
                    break;
                case 2:
                    hasil[i] = 'C';
                    break;
                case 1:
                    hasil[i] = 'D';
                    break;
                default:
                    hasil[i] = 'E';
                    break;
            }
            i++;
        }

        return hasil;
    }
}
