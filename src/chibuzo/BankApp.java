package chibuzo;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner userinput = new Scanner(System.in);
   //      int user = input.nextInt();
        System.out.println("Press 1 for show for English");
        System.out.println("press 2 for show yoruba");
        System.out.println("press 3 for Igbo");
        System.out.println("press 4 for hausa");
        System.out.println("press 5 if them born you well try press 5 if I no commot 10 thousand from your accont");

        int userInput = userinput.nextInt();

        switch (userInput) {

            case 1:
            System.out.println("Press 1 for show for English");


            case2:
            System.out.println("press 2 for show yoruba");

            case3:

            System.out.println("press 3 for Igbo");

            case4:

            System.out.println("press 4 for hausa");

            case5:

            System.out.println("press 5 if them born you well try press 5 if I no commot 10 thousand from your accont");


        }
    }
}