import java.util.Arrays;
import java.util.Scanner;

public class Variations {
    static int[] elements;
    static boolean[]used;
    static int[] variations;

    private static void makeVariations(int index){
        if (index==variations.length){
            System.out.println(String.join(" ", Arrays.toString(variations)));
        }else{
            for (int i = 0; i < elements.length; i++) {
                if (!used[i]){
                    used[i]=true;
                    variations[index]= elements[i];
                    makeVariations(index+1);
                    used[i]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int variationsLength = Integer.parseInt(scanner.nextLine());
        elements =new int[] {1,2,3};
        used = new boolean[elements.length];
        variations = new int[variationsLength];

        makeVariations(0);
    }
}
