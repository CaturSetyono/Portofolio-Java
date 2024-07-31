import java.util.Scanner;
public class if_for3
{
public static void main(String args[])
{
Scanner masuk = new Scanner(System.in);
int i;
for (i=1; i<=10;i++)
{
if(i%2==0)
System.out.println("Bilangan Genap adalah "+i);
else
{
if(i%3!=0)
    System.out.println("Bilangan Ganjil adalah "+i);
}
}
}
}