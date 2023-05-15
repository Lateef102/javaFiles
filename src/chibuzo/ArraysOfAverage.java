package chibuzo;

import java.util.Scanner;

public class ArraysOfAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] num = new int[5];
        int total = 0;
        double average;
        int lengthOfNum = num.length;
        for (int index = 0; index < num.length; index++) {
            System.out.println("enter first number :" + (index +1 ));

            num[index] = input.nextInt();
            total += num[index];
        }
         average = total / lengthOfNum;

        System.out.println("The average is:"+  average);
    }
}