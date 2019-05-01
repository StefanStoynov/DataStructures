package recursionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02_RecursiveFactorial {
    public static void main(String[]args) throws IOException {
        /*
        Write a program that finds the factorial of a given number. Use recursion.
        Note: In practice recursion should not be used here (instead use an iterative solution), this is just an exercise.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int factorialNumber = Integer.parseInt(reader.readLine());

        System.out.println(findFactorial(factorialNumber));

    }

    private static int findFactorial(int factorial){
        int sum = 0;
        if (factorial<1){
            return 1;
        }else{
            sum += factorial * findFactorial(factorial-1);
        }
        return sum;
    }
}
