package recursionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p04_Generating01Vectors {
    public static void main(String[] args) throws IOException {
        /*
        Generate all n-bit vectors of zeroes and ones in lexicographic order.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int[] vector = new int[n];

        generateVector(0, vector);

    }

    private static void generateVector(int n, int[] vector) {
        if (vector.length - 1 < n) {
            System.out.println(String.join(" ", Arrays.toString(vector)));
        } else {
            vector[n] = 0;
            generateVector(n + 1, vector);

            vector[n] = 1;
            generateVector(n + 1, vector);
        }
    }
}
