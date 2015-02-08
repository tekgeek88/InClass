import java.util.Scanner;
 
public class Avg2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
 
      double[] a;
      a = new double[5];      // Define an array of 5 elements

      double sum, avg;
      int i;                           // index 

      for ( i = 0; i <= 4; i++ )
      {
         System.out.print("Enter a number: ");
         a[i] = in.nextDouble();            // Read in number
      }

      /* ---------------------------------------------------
         Use the "running sum" algorithm to compute total
         --------------------------------------------------- */
      sum = 0.0;

      for ( i = 0; i <= 4; i++ )
      {
         sum = sum + a[i];
      }
      avg = sum/5;
      System.out.println(avg);        // Print average
   }
}
