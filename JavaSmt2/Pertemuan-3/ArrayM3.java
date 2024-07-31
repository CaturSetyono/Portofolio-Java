public class ArrayM3 {
public static void main(String[] args) {

String[] nama = {"Jono", "Joni", "Jini", "Jeni", "Juni"};

int[] umur = {25, 30, 55, 35, 40};

System.out.println("Nama\tUmur");
//menampilkan array

for (int i = 0; i < nama.length; i++) {
  System.out.println(nama[i] + "\t" + umur[i]);
}
}
}