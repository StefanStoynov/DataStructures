import java.util.Arrays;

public class CombinationsWithRepetitions {
    static int[] elements;
    static int[] combinations;
    static int combinationsLength;



    public static void main(String[] args) {
        elements = new int[]{1,2,3,4};
        int combinationsLength = 2;
        combinations = new int[combinationsLength];

        makeCombinations(0,0);

    }

    private static void makeCombinations(int index, int start) {
        if (index >= combinations.length) {
            System.out.println(String.join(" ", Arrays.toString(combinations)));
        } else {
            for (int i = start; i < elements.length; i++) {
                combinations[index] = i;
                makeCombinations(index+1,i);
            }
        }
    }
}
