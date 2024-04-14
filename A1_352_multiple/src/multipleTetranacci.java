
import java.io.IOException;
import java.io.PrintWriter;

public class multipleTetranacci {
	    
	    public static long multipleTetranacci(int n) {
	        if (n == 0 || n == 1 || n == 2) { // BASE CASE: if n is 0, 1 or 2, the return value is 0
	            return 0;
	        } else if (n == 3) { // BASE CASE: if n is equal to 3, the return value is 1
	            return 1;
	        } else { // Multiple recursive calls to calculate Tetranacci values by summing the previous four values
	            return multipleTetranacci(n - 1) + multipleTetranacci(n - 2) + multipleTetranacci(n - 3) + multipleTetranacci(n - 4);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            PrintWriter pw = new PrintWriter("TetraOut.txt"); // Created to write to a file

                // Calculating the Tetranacci values from 5 to 35 in increments of 5
	            // * Note that the values are not calculated until 200 due to the excessive amount of time it would take
	            for (int n = 5; n <= 35; n += 5) {
	                long startTime = System.nanoTime(); // Recording the time before the calculation begins
	                long result = multipleTetranacci(n);
	                long endTime = System.nanoTime(); // Recording the time the execution of the calculation ended
	                long elapsedTime = endTime - startTime; // Finding the execution time
	               
//	                System.out.println("Multiple Tetranacci(" + n + "): " + result + "\nTime: " + elapsedTime + " nanoseconds\n\n");

	                pw.println("Multiple Tetranacci(" + n + "): " + result + "\nTime: " + elapsedTime + " nanoseconds\n\n"); // Writing the Tetranacci value and execution time to the file
	           
	            }

	            pw.close();
	        } catch (IOException e) {
	            System.err.println("Error writing to TetraOut.txt");
	            e.printStackTrace();
	        }
	    }
}



