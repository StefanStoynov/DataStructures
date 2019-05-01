package p02_SortWords;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Write a program that reads from the console a sequence of words (strings on a single line, separated by a space).
    Sort them alphabetically. Keep the sequence in List<string>.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Arrays.stream(scanner.nextLine().split("\\s+")).sorted().forEach(System.out::println);
    }
}
