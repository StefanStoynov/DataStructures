package p01_SumAndAverage;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    /*
    Write a program that reads from the console a sequence of integer numbers (on a single line, separated by a space).
    Calculate and print the sum and average of the elements of the sequence. Keep the sequence in List<int>.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(input.split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(String.format("Sum = %d", calculateSum(numbers)));
        System.out.println(String.format("Average = %.2f", calculateAverage(numbers)));

    }

    private static int calculateSum(List<Integer>nums){
        return nums.stream().mapToInt(Integer::intValue).sum();
    }

    private static double calculateAverage(List<Integer>nums){
        return calculateSum(nums)*1.0 / nums.size();
    }
}
