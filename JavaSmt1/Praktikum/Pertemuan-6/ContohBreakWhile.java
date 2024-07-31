public class ContohBreakWhile {
  public static void main(String args[]) {
    int bil = 1;
    while (bil <= 10) {
      if (bil > 5) {
        break;
      }
      System.out.println(bil);
      bil++;
    }
  }
}
