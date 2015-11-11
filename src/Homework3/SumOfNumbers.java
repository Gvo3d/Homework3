package Homework3;
import java.util.Scanner;
/**
 * Made by Yakimov Denis, 11/11/2015 for Hillel Java course       Homework 3
 */
public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("SumOfNumbers");
        System.out.println("Made by Yakimov Denis for Hillel Java Courses");
        String textnumber;
        int number=0;
        int result=0;

        while (number == 0) {
            System.out.println("Enter an valid integer number");
            Scanner in = new Scanner(System.in);
            if (in.hasNextInt()) {
                number = in.nextInt();
            } else System.out.println("Error in data input, reinput number!");
        }

        textnumber = number + "";
        number = textnumber.length();
        String num;
        char[] text = textnumber.toCharArray();

        for (int i=0; i<number; i++){
            num=""+text[i];
            result=result+Integer.parseInt(num);
        }
        System.out.println("Result is "+result);

    }
}