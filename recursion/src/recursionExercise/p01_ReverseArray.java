package recursionExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p01_ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] nums = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[nums.length];

        reverseArray(nums, result, 0, nums.length - 1);
    }

    private static void reverseArray(int[] nums, int[] result, int index, int numsLength) {
        if (index > nums.length - 1) {
            System.out.println(String.join(" ", Arrays.toString(result)));
        } else {
            result[index] = nums[numsLength];
            reverseArray(nums, result, index + 1, numsLength - 1);
        }
    }
}
