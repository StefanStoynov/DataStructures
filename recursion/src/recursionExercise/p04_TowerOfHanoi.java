package recursionExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class p04_TowerOfHanoi {
    private static int stepsTaken = 0;

    public static void main(String[] args) throws IOException {
        /*
        Task is to solve the famous Tower of Hanoi puzzle using recursion.
         */
        Deque<Integer> source = new ArrayDeque<>() {
        };
        source.push(1);
        source.push(2);
        source.push(3);

        Deque<Integer> destination = new ArrayDeque<>();
        Deque<Integer> spare = new ArrayDeque<>();
        moveDisk(3, source, destination, spare);

    }

    private static void moveDisk(int bottomDisk, Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare) {
        if (bottomDisk == 1) {
            stepsTaken++;
            destination.push(source.pop());
            System.out.printf("Step: %d: Move disk: %d%n", stepsTaken, bottomDisk);
            printRoods(source,destination,spare);
        } else {
            moveDisk(bottomDisk-1 , source, spare, destination);
            destination.push(source.pop());
            System.out.printf("Step: %d: Move disk: %d%n", ++stepsTaken, bottomDisk);
            printRoods(source,destination,spare);
            moveDisk(bottomDisk-1 , spare, destination, source);
        }
    }

    private static void printRoods(Deque<Integer> source, Deque<Integer> destination, Deque<Integer> spare) {
        System.out.print("Source: ");
        for (Integer num : source) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Destination: ");
        for (Integer num : destination) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Spare: ");
        for (Integer num : spare) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println();
    }
}
