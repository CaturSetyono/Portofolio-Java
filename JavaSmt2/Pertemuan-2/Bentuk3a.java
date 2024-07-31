	public class Bentuk3a
	{
	public static void main(String[] args)
	{
	       int x = 5;
	       for (int i = 1; i <= x; i++)
	       {
			   for (int j = 4; j >= i; j--)
	           {
	               System.out.print(' ');
	           }
	           for (int k = 1; k <= i; k++)
	           {
	               System.out.print(k);
	           }
	           for (int l = 1; l <= i - 1; l++)
	           {
	               System.out.print(i);
	           }
	           System.out.println();
	       }}}
