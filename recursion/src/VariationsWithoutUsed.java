import java.util.Arrays;
import java.util.Scanner;

public class VariationsWithoutUsed {
    static int[] elements;

    static int[] variations;

    private static void makeVariations(int index) {
        if (index == variations.length) {
            System.out.println(String.join(" ", Arrays.toString(variations)));
        } else {
            for (int i = 0; i < elements.length; i++) {
                variations[index] = elements[i];
                makeVariations(index + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variationsLength = Integer.parseInt(scanner.nextLine());
        elements = new int[]{1, 2, 3};
        variations = new int[variationsLength];

        makeVariations(0);
    }
}
