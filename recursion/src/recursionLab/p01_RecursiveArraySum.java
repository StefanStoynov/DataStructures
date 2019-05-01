package recursionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01_RecursiveArraySum {
    public static void main(String[] args) throws IOException {
        /*
        Write a program that finds the sum of all elements in an integer array. Use recursion.
        Note: In practice recursion should not be used here (instead use an iterative solution),
        this is just an exercise.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] inputNumbers = Arrays
                .stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(sumArray(inputNumbers, inputNumbers.length-1));
    }

    private static int sumArray(int[] numbers, int index) {
        int sum = 0;
        if (index < 0) {
            return 0;
        } else {
            sum += numbers[index]+ sumArray(numbers,index-1);
        }
        return sum;
    }
}
