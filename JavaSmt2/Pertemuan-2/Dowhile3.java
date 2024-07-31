public class Dowhile3 {
  public static void main(String[] args) {
    int a = 5;
    int b = 1;

    do {
      for (int c = 1; c <= b; c++) {
        System.out.print('*');
      }
      System.out.println();
      b++;
    } while (b <= a);
  }
}
