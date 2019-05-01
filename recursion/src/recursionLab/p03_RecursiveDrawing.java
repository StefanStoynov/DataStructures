package recursionLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03_RecursiveDrawing {
    public static void main(String[]args) throws IOException {
        /*
        Write a program that draws the figure below depending on n. Use recursion.
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        draw(n);
    }
    private static void draw(int n){
        if (n<1){
            return;
        }else{
            System.out.println(new String("*").repeat(n));
            draw(n-1);
            System.out.println(new String("#").repeat(n));
        }
    }
}
