package pagefactory.dml;

public class ArrayConcept {

	public static void main(String[] args) {
		
	//	Fibonacci Series 
		class FibonacciSeries {

			
			public static void main(String args[]) 
			{
				 
			int a = 0, b = 1, c, i, count = 10;
				 // To print 0 and 1
			
			System.out.print(a + " " + b);
				
			
			for (i = 2; i < count; i++) {             // loop starts from 2. We have already printed 0 and 1 in the previous step
			
				c = a + b;
				
				System.out.print(" " + c);
				
				a = b;
				
				b = c;
				
			}
			}
			
		}
		
		//order number 
		public class Ordernumber {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

				
				String str = "hello 14:12";
				str = str.replaceAll("[^0-9]+", " ");
				System.out.println(Arrays.asList(str.trim().split(" ")));

			}

		}

	}

}
