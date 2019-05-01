package p05_CountOfOccurences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> input = Arrays
                .stream(reader.readLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted()
                .collect(Collectors.toList());

        Map<Integer, Integer> result = new HashMap<>();


        for (Integer number : input) {

            int count = 0;
            result.put(number, count);

            for (int i = 0; i < input.size(); i++) {
                if (number.equals(input.get(i))) {
                    count++;
                    result.put(number, count);
                } else {
                    count = 0;
                }
            }
        }


        for (Map.Entry<Integer, Integer> Entry : result.entrySet()) {
            System.out.printf("%d -> %d times%n", Entry.getKey(), Entry.getValue());
        }
    }
}
