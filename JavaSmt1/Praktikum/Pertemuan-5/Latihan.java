import java.util.Scanner;
public class Latihan {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris: ");
    int j_baris = input.nextInt(); //Menentukan Jumlah Baris

     for(int baris=1; baris<=j_baris; baris++){

       for(int s=1; s<=baris; s++){
           System.out.print("* ");
       }
       System.out.println();
     }
  }
}