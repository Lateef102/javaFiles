package Chapter2Exercises;

import jdk.jfr.StackTrace;

import java.util.Scanner;

public class Femi {

    private static Scanner name;




    public static void main(String[] args) {

        Scanner slang2 = new Scanner(System.in);

        name = slang2;
        System.out.println(" Enter your first name");
        String input = slang2.next();
        System.out.println("Hello name");





    }
}
