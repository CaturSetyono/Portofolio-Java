public class Whileno5 {
  public static void main(String[] args) {
    int x = 5;
    int i = 1;
    while (i <= x) {
      int j = 4;
      while (j >= i) {
        System.out.print(' ');
        j--;
      }

      int k = 1;
      while (k <= i) {
        System.out.print(k);
        k++;
      }

      int l = 1;
      while (l <= i - 1) {
        System.out.print(i);
        l++;
      }

      System.out.println();
      i++;
    }
  }
}
