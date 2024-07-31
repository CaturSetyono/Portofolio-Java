import java.util.Scanner;

public class prakTambahan2 {

    public void selectionSort(float larik2[]) {
        for (int i = 0; i < larik2.length; i++) {
            int min = i;
            for (int elemen = i + 1; elemen < larik2.length; elemen++) {
                if (larik2[min] > larik2[elemen])
                    min = elemen;
            }
            tukar(larik2, min, i);
            System.out.println("Setelah Di Tukar : ");
            printArray(larik2);
        }
    }

    public void tukar(float larik3[], int satu, int dua) {
        float temp;
        temp = larik3[satu];
        larik3[satu] = larik3[dua];
        larik3[dua] = temp;
    }

    public void printArray(float[] array) {
        for (float value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        prakTambahan2 lrk = new prakTambahan2();
        float nilai[] = new float[5];
        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukan");
        lrk.printArray(nilai);
        System.out.println("Data hasil pengurutan    ");
        lrk.selectionSort(nilai);
        lrk.printArray(nilai);
    }
}
