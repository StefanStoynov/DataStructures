package p03_LongestSubsequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    /*
    Write a method that finds the longest subsequence of equal numbers in given List<int> and returns the result as new
    List<int>.
    If several sequences has the same longest length, return the leftmost of them. Write a program to test whether
    the method works correctly.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays
                .stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        longestSequence(input);

    }

    private static void longestSequence(List<Integer> input) {

        int sequenceSize = 0;
        int best = 0;
        int bestNumber = input.get(0);

        for (int i = 0; i < input.size() - 1; i++) {
            if (input.get(i).equals(input.get(i + 1))) {
                sequenceSize++;
                if (sequenceSize > best) {
                    best = sequenceSize;
                    bestNumber = input.get(i);
                }
            } else {
                sequenceSize = 0;
            }
        }

        for (int i = 0; i < best + 1; i++) {
            System.out.print(bestNumber + " ");
        }


    }
}
