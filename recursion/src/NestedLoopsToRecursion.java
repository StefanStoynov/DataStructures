import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class NestedLoopsToRecursion {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfLoops = Integer.parseInt(reader.readLine());
        int[] generatedNums = new int[numberOfLoops];
        int index = 0;
        generateNumbers(generatedNums, index);
    }

    private static void generateNumbers(int[] array, int index) {
        if (index == array.length) {
            System.out.println(String.join(" ", Arrays.toString(array)));
        } else {
            for (int i = 1; i <= array.length; i++) {
                array[index] = i;
                generateNumbers(array, index + 1);
            }
        }

    }
}
