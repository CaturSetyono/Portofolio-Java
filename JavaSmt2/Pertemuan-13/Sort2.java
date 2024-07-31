
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 
{
   public static void main( String[] args )
   {
      String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
      List< String > list = Arrays.asList( suits ); 
      System.out.printf( "Unsorted array elements: %s\n", list );
      Collections.sort( list, Collections.reverseOrder() ); 
      System.out.printf( "Sorted list elements: %s\n", list );
   } 
} 