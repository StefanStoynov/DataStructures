import java.util.Scanner;

public class DrawFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        draw(num);
    }

    private static void draw(int number){
       
        if (number==0){
            return;
        }
        String asterisk = "*";
        System.out.println(asterisk.repeat(number));
        draw(number-1);
        String hashtag = "#";
        System.out.println(hashtag.repeat(number));
    }
}
