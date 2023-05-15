package chibuzo;

import java.util.Scanner;

public class JenniferLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the userNumber");
        int userNumber = input.nextInt();

        int counter = 1;
        while (counter <= userNumber) {
            System.out.println(counter);
            counter = counter +1;


        }



    }


}

