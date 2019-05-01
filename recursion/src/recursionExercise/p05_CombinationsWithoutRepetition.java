package recursionExercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p05_CombinationsWithoutRepetition {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numbersLength = Integer.parseInt(reader.readLine());
        int[]numbers = new int[numbersLength];
        for (int i = 0; i <numbersLength ; i++) {
            numbers[i] = i+1;
        }
        int combinationLength = Integer.parseInt(reader.readLine());
        int[] combinations = new int[combinationLength];
        createCombinations(numbers,combinations,0,0);

    }
    private static void createCombinations(int[]nums, int[]result, int index, int start){
        if (index>result.length-1){
            System.out.println(String.join(" ", Arrays.toString(result)));
        }else{
            for (int i = start; i < nums.length; i++) {
                result[index] = nums[i];
                createCombinations(nums,result,index+1, i+1);
            }
        }
    }
}
