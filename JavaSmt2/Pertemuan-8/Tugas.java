import java.util.Scanner;

public class Tugas {
    public static int tambah(int a, int b) {
        return (a + b);
    }

    public static int kurang(int a, int b) {
        return (a - b);
    }

    public static int kali(int a, int b) {
        return (a * b);
    }

    public static double bagi(int a, int b) {
        // Check for division by zero
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return ((double) a / b);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choose, a, b;

        do {
		    a = 0;
		    b = 0;
		    System.out.print("Masukkan nilai a: ");
		    a = in.nextInt();
		    System.out.print("Masukkan nilai b: ");
            b = in.nextInt();
            System.out.println("+---------------+");
            System.out.println("|   Kalkulator  |");
            System.out.println("+---------------+");
            System.out.println("|1.Tambah       |");
            System.out.println("|2.Kurang       |");
            System.out.println("|3.Kali         |");
            System.out.println("|4.Bagi         |");
            System.out.println("|0.exit         |");
            System.out.println("+---------------+");
            System.out.print("Masukan Pilihan : ");
            choose = in.nextInt();
            System.out.println("+---------------+");
            switch (choose) {
                case 1:
                    System.out.println("|Hasilnya : " + tambah(a,b));
                    break;
                case 2:
                    System.out.println("|Hasilnya : " + kurang(a,b));
                    break;
                case 3:
                    System.out.println("|Hasilnya : " + kali(a,b));
                    break;
                case 4:
                    System.out.println("|Hasilnya : " + bagi(a, b));
                    break;
            }
            System.out.println("+------------------------+");
        } while (choose != 0);
    }
}
