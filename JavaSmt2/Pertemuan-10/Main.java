import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("Pilih jenis kalkulator:");
            System.out.println("1. Aritmatika");
            System.out.println("2. Statistika");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    performArithmetic(scanner);
                    break;
                case 2:
                    performStatistics(scanner);
                    break;
                case 3:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (choice != 3);
        
        scanner.close();
    }

    private static void performArithmetic(Scanner scanner) {
        System.out.print("Masukkan bilangan pertama: ");
        double num1 = scanner.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double num2 = scanner.nextDouble();

        System.out.println("Pilih operasi aritmatika:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan Anda: ");
        int operation = scanner.nextInt();

        double result;
        switch (operation) {
            case 1:
                result = num1 + num2;
                System.out.println("Hasil: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Hasil: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Hasil: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Hasil: " + result);
                } else {
                    System.out.println("Kesalahan: Pembagian dengan nol tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Operasi tidak valid.");
        }
    }

    private static void performStatistics(Scanner scanner) {
        System.out.print("Masukkan jumlah data: ");
        int n = scanner.nextInt();
        double[] data = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            data[i] = scanner.nextDouble();
        }
        
        double sum = 0;
        for (double num : data) {
            sum += num;
        }
        
        double mean = sum / n;
        
        double sumSquare = 0;
        for (double num : data) {
            sumSquare += Math.pow(num - mean, 2);
        }
        
        double variance = sumSquare / n;
        double stdDeviation = Math.sqrt(variance);
        
        System.out.println("Rata-rata: " + mean);
        System.out.println("Variansi: " + variance);
        System.out.println("Standar Deviasi: " + stdDeviation);
    }
}
