package recursionExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p02_NestedLoopsToRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfLoops = Integer.parseInt(reader.readLine());
        int[] result = new int[numberOfLoops];
        generateLoops(result, 0);
    }

    private static void generateLoops(int[] result, int start) {
        if (result.length - 1 < start) {
            System.out.println(String.join(" ", Arrays.toString(result)));
        } else {
            for (int i = 1; i <= result.length; i++) {
                result[start] = i;
                generateLoops(result, start + 1);
            }
        }
    }
}
