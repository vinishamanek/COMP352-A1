
import java.io.IOException;
import java.io.PrintWriter;

public class linearTetranacci {
	public static long[] linearTetranacci(int n) {
				
		// Initializing an array with the first four Tetranacci values
		long[] A = new long[4];
		long a = 0, b = 0, c = 0, d = 1;
		
		if (n == 0) { // BASE CASE: if n is 0, the return value is 0
			A[0] = 0;
			return A;
		} else if (n == 1) { // BASE CASE: if n is 1, the return value is 0
			A[0] = 0;
			A[1] = 0;
			return A;
		} else if (n == 2) { // BASE CASE: if n is 2, the return value is 0
			A[0] = 0;
			A[1] = 0;
			A[2] = 0;
			return A;
		} else if (n == 3) { // BASE CASE: if n is equal to 3, the return value is 1
			A[0] = 0;
			A[1] = 0;
			A[2] = 0;
			A[3] = 1;
			return A;
		} else {
		
			A = linearTetranacci(n-1); // Recursive call to calculate Tetranacci values for n-1
			
			// Extracting the previous values from the array
			a = A[0];
			b = A[1];
			c = A[2];
			d = A[3];
			
			long next = a + b + c + d; // Calculating the next Tetranacci value
					
			// Updating the array with new values
			A[0] = b;
			A[1] = c;
			A[2] = d;
			A[3] = next;
			
			return A;
		}
	}
	
	public static void main(String[] args) {
		 try {
			 
	            PrintWriter pw = new PrintWriter("TetraOut.txt"); // Created to write to a file

	            // Calculating the Tetranacci values from 5 to 200 in increments of 5
	            for (int n = 5; n <= 200; n += 5) {
	                long startTime = System.nanoTime(); // Recording the time before the calculation begins
	                long[] result = linearTetranacci(n);
	                long endTime = System.nanoTime(); // Recording the time the execution of the calculation ended
	                long elapsedTime = endTime - startTime; // Finding the execution time
	                
//	                System.out.println("Linear Tetranacci(" + n + "): " + result[3] + "\nTime: " + elapsedTime + " nanoseconds. \n\n");

	                
	                pw.println("Linear Tetranacci(" + n + "): " + result[3] + "\nTime: " + elapsedTime + " nanoseconds. \n\n"); // Writing the Tetranacci value and execution time to the file
	            }

	            pw.close();
	        } catch (IOException e) {
	            System.err.println("Error writing to TetraOut.txt");
	            e.printStackTrace();
	        }
	}

}
