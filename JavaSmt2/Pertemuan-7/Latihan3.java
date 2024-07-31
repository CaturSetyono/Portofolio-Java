import java.util.Scanner;
public class Latihan3
{
public static void main(String args[])
{
Scanner masuk = new Scanner(System.in);
int score=0, sum = 0;
while (score !=-1){
System.out.print("Masukan nilai - 1 untuk keluar = ");
score=masuk.nextInt();
   if (score !=-1)
       sum =sum + score;
}
 System.out.println("hasil penjumlahan = "+sum);
}
}
