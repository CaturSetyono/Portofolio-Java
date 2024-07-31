import java.util.Scanner;

public class prakTambahan {

    public void bubbleSort(float larik2[]) {
        for (int i = 0; i < larik2.length; i++) {
            for (int elemen = 0; elemen < larik2.length - 1; elemen++) {
                if (larik2[elemen] > larik2[elemen + 1]) {
                    System.out.println("Tukar : " + larik2[elemen] + " dan " + larik2[elemen + 1]);
                    tukar(larik2, elemen, elemen + 1);
                    printArray(larik2);
                }
            }
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
        prakTambahan lrk = new prakTambahan();
        float nilai[] = new float[5];
        System.out.println("Masukan 5 buat data nilai");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " : ");
            nilai[i] = masuk.nextFloat();
        }
        System.out.println("Data nilai yang dimasukan");
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
        System.out.println("Data hasil pengurutan    ");
        lrk.bubbleSort(nilai);
        for (int i = 0; i < 5; i++)
            System.out.println(nilai[i]);
    }
}
