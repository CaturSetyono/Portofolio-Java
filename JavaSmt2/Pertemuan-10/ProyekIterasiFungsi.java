import java.util.Scanner;

public class ProyekIterasiFungsi {

    public static void cetakUlang(int nUlang){
        for (int i=0;i<nUlang;i++){
            System.out.println("Cetak ke "+(i+1));
        }
    }
public static void main(String[] args) {
        int nUlang; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Akan dicetak berapa kali :?");
        nUlang = scan.nextInt();
        cetakUlang(nUlang);
    }
}
