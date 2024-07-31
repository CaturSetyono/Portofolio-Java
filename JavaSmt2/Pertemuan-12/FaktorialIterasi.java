public class FaktorialIterasi {
  public static void main(String[] args) {
    int batas = 5;
    int counter = 0;
    int faktorial = 1;
    for (counter = 1; counter <= batas; counter++)
      faktorial *= counter;
    System.out.println("Nilai " + batas + "!" + " adalah " + faktorial);
  }
}
