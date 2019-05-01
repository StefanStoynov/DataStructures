package p04_RemoveOddOccurences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays.stream(reader.readLine()
                .split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> result = new LinkedList<>();

        for (Integer number : input) {
            int repeat = 0;
            for (int i = 0; i < input.size(); i++) {
                int num = number;
                if (num == input.get(i)) {
                    repeat++;
                }
            }

            if (repeat % 2 == 0) {
                result.add(number);
            }
        }
        result.forEach(num -> System.out.print(num + " "));
    }
}
