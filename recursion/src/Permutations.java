import java.util.Arrays;

public class Permutations {
    static int[] elements;
    static boolean[] used;
    static int[] permutations;

    public static void main(String[] args) {
        elements = new int[]{1, 2, 3};
        used = new boolean[elements.length];
        permutations = new int[elements.length];

        permute(0);
    }

    static void permute(int index) {
        if (index >= elements.length) {
            System.out.println(String.join(" ", Arrays.toString(permutations)));
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]) {
                    int currentElement = elements[i];
                    permutations[index] = currentElement;
                    used[i] = true;
                    permute(index + 1);
                    used[i] = false;
                }

            }
        }
    }
}
