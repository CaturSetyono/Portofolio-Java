import java.util.Scanner;
public class if_for1
{
public static void main(String args[])
{
Scanner masuk = new Scanner(System.in);
int score, sum = 0;
do
{
System.out.print("Masukan nilai - 1 untuk keluar = ");
score=masuk.nextInt();
   if (score !=-1)
       sum =sum + score;
}
while (score !=-1);
 System.out.println("hasil penjumlahan = "+sum);
}
}
