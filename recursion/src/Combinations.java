import java.util.Arrays;

public class Combinations {
    static int[] elements;
    static int[] combinations;
    static int combinationsLength;



    public static void main(String[] args) {
        elements = new int[]{5,6,7,8,9};
        combinationsLength = 3;
        combinations = new int[combinationsLength];

        makeCombinations(0,0);

    }

    private static void makeCombinations(int index, int start) {
        if (index >= combinationsLength) {
            System.out.println(String.join(" ", Arrays.toString(combinations)));
        } else {
            for (int i = start; i < elements.length; i++) {
                combinations[index] = elements[i];
                makeCombinations(index+1,i+1);
            }
        }
    }
}
