import java.util.Scanner;

public class modifPrak1 {
    
    public static void cetakUlang(int nUlang, String Cetak) {
        
        for (int i=0;i<nUlang;i++){
            System.out.println((i+1)+"."+Cetak);
        }
    }
public static void main(String[] args) {
        int nUlang;
        String Cetak;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Pesan : ");
        Cetak = scan.nextLine();
        System.out.print("Akan dicetak berapa kali : ");
        nUlang = scan.nextInt();
        cetakUlang(nUlang,Cetak);
    }
}
