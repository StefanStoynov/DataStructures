package recursionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p05_GeneratingCombinations {
    public static void main(String[] args) throws IOException {
        /*
        Generate all n choose k combinations. Read the set of elements, then number of elements to choose.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] numbers = Arrays.stream(reader.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int lengthGeneratedNumber = Integer.parseInt(reader.readLine());
        int[] result = new int[lengthGeneratedNumber];
        generateCombination(numbers, result, 0, 0);

    }

    private static void generateCombination(int[] numbers, int[] result, int index, int start) {

        if (result.length - 1 < index) {
            System.out.println(String.join(" ", Arrays.toString(result)));
        } else {
            for (int i = start; i < numbers.length; i++) {
                result[index] = numbers[i];
                generateCombination(numbers, result, index + 1, i +1);
            }

        }
    }
}
