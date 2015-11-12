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
        int ax, ay, bx, by,cx,cy;

        ax=GetNumber();
        ay=GetNumber();
        bx=GetNumber();
        by=GetNumber();
        System.out.println("Enter a point location!");
        cx=GetNumber();
        cy=GetNumber();

        if ((bx>=cx) && (cx>=ax) &&(by>=cy) && (cy>=ay)) {
            System.out.println("Point is in square!");
        } else System.out.println("Point is not in a square!");
        }

    public static int GetNumber() {
        int number=0;
        System.out.println("Enter an valid integer number");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            number = in.nextInt();
        } else System.out.println("Error in data input, reinput number!");
        return number;
    }


}
