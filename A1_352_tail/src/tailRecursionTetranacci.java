
import java.io.IOException;
import java.io.PrintWriter;

public class tailRecursionTetranacci {
    
    public static long[] tailRecursionTetranacci(int n, long a, long b, long c, long d) {
    	if (n < 3) { // BASE CASE: for n less than 3, the return value is 0
            long[] A = {0, 0, 0, 0};
            return A;
        } else if (n == 3) { // BASE CASE: for n equal to 3, the return value is 1 
            long[] A = {a, b, c, d};
            return A;
        } else { // RECURSIVE CASE: Calculates the next Tetranacci number and makes a recursive call
            long next = a + b + c + d; 
            return tailRecursionTetranacci(n - 1, b, c, d, next);
        }
    }

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("TetraOut.txt"); // Created to write to a file

            // Calculating the Tetranacci values from 5 to 200 in increments of 5
            for (int n = 5; n <= 200; n += 5) {
                long startTime = System.nanoTime(); // Recording the time before the calculation begins
                long[] result = tailRecursionTetranacci(n, 0, 0, 0, 1);
                long endTime = System.nanoTime(); // Recording the time the execution of the calculation ended
                long elapsedTime = endTime - startTime; // Finding the execution time

//                System.out.println("Tail Tetranacci(" + n + "): " + result[3] + "\nTime: " + elapsedTime + " nanoseconds \n\n");

                pw.println("Tail Tetranacci(" + n + "): " + result[3] + "\nTime: " + elapsedTime + " nanoseconds \n\n");
            }

            pw.close();
        } catch (IOException e) {
            System.err.println("Error writing to TailTetraOut.txt");
            e.printStackTrace();
        }
    }
}
