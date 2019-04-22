import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CombinationsWithRepetition {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int setOfNumbers = Integer.parseInt(reader.readLine());
        int border = Integer.parseInt(reader.readLine());

        int[] numbers = new int[setOfNumbers];
        for (int i = 1; i <= setOfNumbers; i++) {
            numbers[i - 1] = i;
        }

        int[] generated = new int[border];
        generateArray(generated, numbers, 0, 0);
    }

    private static void generateArray(int[] generated, int[] numbers, int index, int border) {
        if (index > generated.length - 1) {
            System.out.println(String.join(" ", Arrays.toString(generated)));
        } else {
            for (int i = border; i < numbers.length; i++) {
                generated[index] = numbers[i];
                generateArray(generated, numbers, index + 1, i);
            }
        }
    }
}
