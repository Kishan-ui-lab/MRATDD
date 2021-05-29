package pagefactory.dml;

public class WifiResults {
	
	public static void main(String[] args) {

	    int num1 = 33, j = 2;
	    boolean flag = false;
	    while (j <= num1 / 2) {
	      // condition for nonprime number
	      if (num1 % j == 0) {
	        flag = true;
	        break;
	      }

	      ++j;
	    }

	    if (!flag)
	      System.out.println(num1 + " is a prime number.");
	    else
	      System.out.println(num1+ " is not a prime number.");
	  
  

    int num = 29;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }

}
