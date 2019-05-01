package recursionExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p03_CombinationsWithRepetition {
    /*
    Write a recursive program for generating and printing all combinations with duplicates of
    k elements from a set of n elements (k <= n). In combinations, the order of elements doesn’t matter,
    therefore (1 2) and (2 1) are the same combination, meaning that once you print/obtain (1 2), (2 1)
    is no longer valid.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int elementsLength = Integer.parseInt(reader.readLine());
        int[] elements = new int[elementsLength];
        for (int i = 0; i < elementsLength; i++) {
            elements[i] = i + 1;
        }

        int groupLength = Integer.parseInt(reader.readLine());
        int[] group = new int[groupLength];

        makeGroup(elements, group, 0, 0);

    }

    private static void makeGroup(int[] elements, int[] group, int index, int start) {
        if (group.length - 1 < index) {
            System.out.println(String.join(" ", Arrays.toString(group)));
        } else {
            for (int i = start; i < elements.length; i++) {
                group[index] = elements[i];
                makeGroup(elements, group, index + 1, i);
            }
        }
    }
}
