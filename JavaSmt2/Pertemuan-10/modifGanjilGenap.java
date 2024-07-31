import java.util.Scanner;

public class modifGanjilGenap{

    public static String[] cekGanjilGenapArray(int[] x){
        String hasil[] = new String[10];
        for (int i=0;i<x.length;i++){
            if ((x[i] % 2) == 0){
                hasil[i] = "Genap";
            }else {
                hasil[i] = "Ganjil";
            }
        }
        return hasil; 
    }
    public static void main(String[] args) {
        int data[] = new int[10];
        String hasilCek[] = new String[10];
        Scanner scan = new Scanner(System.in);
        for (int i=0;i<10;i++){
            System.out.print("Masukkan data ke-"+(i+1)+":");
            data[i] = scan.nextInt();
        }
        hasilCek = cekGanjilGenapArray(data);
        System.out.println("==========================");
        System.out.println("==Hasil Pengecekan========");
        System.out.println("==========================");
        
        for (int i=0;i<10;i++){
            System.out.print(" "+data[i]+" ");
            System.out.println(hasilCek[i]);
        }
    }
}