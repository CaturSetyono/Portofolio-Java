import java.util.Scanner;

public class ArrayInputUser {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Get array size from user
    System.out.print("Masukkan jumlah bilangan: ");
    int n = input.nextInt();

    // Declare array to store integers
    int[] bilangan = new int[n];

    // Get input for each element of the array
    for (int i = 0; i < n; i++) {
      System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
      bilangan[i] = input.nextInt();
    }

    // Display the elements of the array
    System.out.print("Bilangan yang anda masukkan: ");
    for (int i = 0; i < n; i++) {
      System.out.print(bilangan[i] + " ");
    }
     System.out.println();
  }
}
