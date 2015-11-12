package Homework3;

import java.util.Scanner;

public class Fibonach {
    public static void main(String[] args) {
        System.out.println("Fibonacchi Number");
        System.out.println("Made by Yakimove Denis for Hillel Java Courses");

        int number=0;
        System.out.println("Enter an valid integer number");
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            number = in.nextInt();
        } else System.out.println("Error in data input, reinput number!");


        System.out.println(fib(number));
    }

    public static int fib(int n)
    {
        if (n == 0) { return 0; }
        else
        {
            if ((n == -1) || (n == 1)) { return 1; }
            else
            {
                if (n > 0) { return fib(n - 1) + fib(n - 2); }
                else { return fib(n + 2) - fib(n + 1); }
            }
        }
    }

}
