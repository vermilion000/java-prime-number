
import java.util.*;


public class tester {
      public static void main(String[] args) {
    	  int n,i,k =0;
    	  System.out.println("Enter a number");
    	  Scanner s = new Scanner(System.in);
    	  n = s.nextInt();
      for (i= 1;i<n/2 ;i++) {
			if (n % i == 0)
				k = 0;
			else {
				k = 1;
			    System.out.println(n + "is not a prime number .");
				break ; }
		}
		if (k==0) System.out.println(n + "is a prime number .");
      }
}