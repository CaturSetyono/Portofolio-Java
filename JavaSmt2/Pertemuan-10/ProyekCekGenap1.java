import java.util.Scanner; 

public class ProyekCekGenap1 {

    public static boolean cekGenap(int a){
        boolean status;
        if ((a % 2) == 0){
            status = true;
        }else {
            status = false;
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x;
        boolean genap;
        System.out.print("Masukkan bilangan : ");
        x = scan.nextInt();
        genap = cekGenap(x);
        if (genap){
           System.out.println("Bilangan yang dicek ternyata genap");
        }else{
          System.out.println("Bilangan yang dicek ternyata ganjil");
        }      
    }
}
