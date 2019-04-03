public class PrintFigure {
    public static void main(String[] args) {
        printFigure(5);
    }

    private static void printFigure(int n){
        //check
        if(n==0){
            return;
        }

        //action
        String str = "*";
        System.out.println(str.repeat(n));

        //recursive method call
        printFigure(n-1);

        //post action after bottom is reached
        String str2 = "#";
        System.out.println(str2.repeat(n));

    }
}
