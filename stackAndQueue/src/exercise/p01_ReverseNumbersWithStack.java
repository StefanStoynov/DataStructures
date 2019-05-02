package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class p01_ReverseNumbersWithStack {
    /*
    Write a program that reads N integers from the console and reverses them using a stack.
    Use the Stack<int> class from .NET Framework. Just put the input numbers in the stack and pop them.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        Stack<Integer> result = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            result.push(input[i]);
        }

        while (!result.empty()) {
            System.out.print(result.pop() + " ");
        }
    }
}
