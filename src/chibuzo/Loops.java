package chibuzo;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("enter the firstNumber");
        int firstNumber = userInput.nextInt();
        int sum = 0;
        while (sum < firstNumber){
            int i = 0;
            System.out.println("enter summing number");
            i = userInput.nextInt();
             sum = sum + i;
             if ( sum >= firstNumber) break;
    }
        System.out.println(firstNumber );
        System.out.println(sum);

    }


}
