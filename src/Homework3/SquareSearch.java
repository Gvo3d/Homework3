package Homework3;
import java.util.Scanner;
/**
 * Made by Yakimov Denis, 11/11/2015 for Hillel Java course       Homework 3
 */
public class SquareSearch {
    public static void main(String[] args) {
        System.out.println("SquareSearch");
        System.out.println("Made by Yakimov Denis for Hillel Java Courses");
        System.out.println("Input two point(X and Y coordinates for both).");
        int number = 0;
        int counter=0;
        int ax,ay,bx,by;

        while (number == 0) {
            System.out.println("Enter an valid integer number");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                ax=number;
                number = in.nextInt();
            } else System.out.println("Error in data input, reinput number!");
        }


    }
}
