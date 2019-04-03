import java.util.Scanner;

public class VectorGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vectorSize = Integer.parseInt(scanner.nextLine());
        int[] vector = new int[vectorSize];

        generate(vector,vectorSize-1);

    }

    private static void generate(int[] vector, int index){
        if (index == -1){
            for (int i : vector) {
                System.out.print(i);
            }
            System.out.println();
            return;
        }

        for (int i = 0; i <=1 ; i++) {
            vector[index] = i;
            generate(vector, index-1);
        }


    }
}
