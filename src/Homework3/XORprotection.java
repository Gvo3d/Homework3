package Homework3;


import java.util.Scanner;

public class XORprotection {
    public static void main(String[] args) {
        System.out.println("XOR protection");
        System.out.println("Made by Yakimove Denis for Hillel Java Courses");
        System.out.println("Enter a value that needs to be protected and then a key for protection");
        int number=0;
        int key=0;

        System.out.println("Input a number");
        number=GetNumber();
        System.out.println("Input a key!");
        key=GetNumber();

        String numbers = ""+number;
        String keys = ""+key;
        System.out.println("XOR text for this number is "+ XORal(numbers, keys) );

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

    public static byte[] XORal(String TextNum, String keynum) {
        byte[] text = TextNum.getBytes();
        byte[] key = keynum.getBytes();
        byte[] res = new byte[ TextNum.length() ];

        for (int i =0; i<text.length; i++){
            res[i]=(byte) (text[i] ^ key[i % key.length]);
        }

        return res;
    }


}
