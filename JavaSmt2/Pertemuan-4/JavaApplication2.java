import java.util.Scanner;
public class JavaApplication2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int nim[],mhs,jml, banyakTes = 3, nilai[][], ntt[], ntr[];
        float rata[], jumlah[], rtt, rtr;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        mhs = input.nextInt();
        String nama[]= new String[mhs];
        nim=new int[mhs];
        String jurusan[]= new String[mhs];

        nilai = new int[mhs][banyakTes];
        jumlah = new float[mhs];
        rata = new float[mhs];
        ntt = new int[banyakTes];
        ntr = new int[banyakTes];
        System.out.println();
        for(int h=0;h<mhs;h++){ //Mahasiswa
         System.out.println("=================================");
            System.out.print("Nama Mahasiswa " + (h+1)+": ");
            nama[h]=input.next();
            System.out.print("NIM Mahasiswa " + (h+1)+": ");
            nim[h]=input.nextInt();
            System.out.print("Jurusan Mahasiswa " + (h+1)+": ");
            jurusan[h]=input.next();
         System.out.println("=================================");

            for(int i=0;i<banyakTes;i++){ //Tes keberapa
                System.out.print("Nilai Tes " + (i+1) + " : ");
                nilai[h][i] = input.nextInt();
                jumlah[h] = jumlah[h] + nilai[h][i];
            }
            rata[h] = jumlah[h]/banyakTes;
            System.out.println();
        }
        for(int i=0;i<banyakTes;i++){
            ntt[i] = nilai[0][i];
            ntr[i] = nilai[0][i];
        }
        rtt = rata[0];
        rtr = rata[0];
        for(int i=0;i<banyakTes;i++){
            for(int j=0;j<mhs;j++){
                if(ntt[i] < nilai[j][i]){
                    ntt[i] = nilai[j][i];
                }
                if(ntr[i] > nilai[j][i]){
                    ntr[i] = nilai[j][i];
                }
            }
        }
        for(int i=0;i<mhs;i++){
            if(rtt < rata[i]){
                    rtt = rata[i];
                }
                if(rtr > rata[i]){
                    rtr = rata[i];
                }
        }
        System.out.println("---------------------------");
        System.out.println("Daftar Nilai Mahasiswa : ");
        System.out.println("---------------------------");
        System.out.println();
     System.out.println(" Nama\t\t  NIM \tJurusan \t Test 1\tTest 2\tTest 3\tRata-rata");
        for(int j=0;j<mhs;j++){
            System.out.print((j+1)+". "+nama[j] +"  \t"+nim[j]+"\t"+jurusan[j]+"\t ");
            for(int k=0;k<banyakTes;k++){
                System.out.print("\t" + nilai[j][k]);
            }
            System.out.print("\t" + rata[j]);
            System.out.println();
        }
        System.out.println();
        System.out.print("Nilai Tertinggi\t");
        for(int j=0;j<banyakTes;j++){//Nilai tertinggi
            System.out.print(ntt[j] + "\t");
        }
        System.out.print(rtt);//Rata-rata tertinggi
        System.out.println();
        System.out.print("Nilai Teredah\t");
        for(int j=0;j<banyakTes;j++){//Nilai terendah
            System.out.print(ntr[j] + "\t");
        }
        System.out.print(rtr);//Rata-rata terendah
        System.out.println();
    }
}
