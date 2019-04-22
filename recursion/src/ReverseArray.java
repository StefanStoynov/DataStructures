import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] input = Arrays.stream(reader.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        reverseArray(input,0,input.length-1);
        System.out.println(String.join(" ", Arrays.toString(input)));

    }

    private static void reverseArray(int[]array, int startIndex, int endIndex){
        if (endIndex>startIndex){
            int end = array[endIndex];
            int start = array[startIndex];
            array[startIndex] = end;
            array[endIndex] = start;
            reverseArray(array,startIndex+1, endIndex-1);
        }
    }
}
