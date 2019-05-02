package exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class p02_CalculateSequenceWithQueue {
    public static void main(String[] args) throws IOException {
        /*
        We are given the following sequence of numbers:
            •	S1 = N
            •	S2 = S1 + 1
            •	S3 = 2*S1 + 1
            •	S4 = S1 + 2
            •	S5 = S2 + 1
            •	S6 = 2*S2 + 1
            •	S7 = S2 + 2
            •	…
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int start = Integer.parseInt(reader.readLine());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        List<Integer> result = new LinkedList<>();
        queue.offer(start);


        while (result.size() != 50) {
            int current = queue.pop();
            result.add(current);

            queue.offer(current + 1);
            queue.offer(2 * current + 1);
            queue.offer(current + 2);
        }

        System.out.println(String.join(" ", result.toString()));
    }
}
