import java.util.Arrays;
import java.util.Scanner;

public class GenerateVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vectorLength = Integer.parseInt(scanner.nextLine());
        int[] vector = new int[vectorLength];
        int[] set = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        generateVector(0,vector);

        //generateSet(vector,set,0,0);


    }

    private static void generateVector(int index, int[] vector) {
        if (index > vector.length - 1) {
            System.out.println(String.join(" ", Arrays.toString(vector)));
        } else {
            vector[index] = 0;
            generateVector(index + 1, vector);

            vector[index] = 1;
            generateVector(index + 1, vector);
        }
    }

    private static void generateSet(int[]vector, int[] set, int index, int border){
        if (index>vector.length-1){
            System.out.println(String.join(" ", Arrays.toString(vector)));
        }else{
            for (int i = border; i < set.length; i++) {
                vector[index]=set[i];
                generateSet(vector,set,index+1,i+1);
            }
        }
    }
}
