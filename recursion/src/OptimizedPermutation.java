import java.util.Arrays;

public class OptimizedPermutation {
    private static int[] elements;

    private static void permitate(int index) {
        if (index >= elements.length) {
            System.out.println(String.join(" ", Arrays.toString(elements)));
        } else {
            permitate(index + 1);
            for (int i = index + 1; i < elements.length; i++) {
                swap(index, i);
                permitate(index+1);
                swap(index, i);
            }

        }
    }

    private static void swap(int first, int second) {
        int temp = elements[first];
        elements[first] = elements[second];
        elements[second] = temp;
    }

    public static void main(String[] args) {

    }
}
