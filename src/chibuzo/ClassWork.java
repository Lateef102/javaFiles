package chibuzo;

import java.util.Scanner;

public class ClassWork {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);


        int Score = 0;
            int counter = 0;
            while (counter < 5) {
                System.out.println("Enter scores " + counter);
               Score += user.nextInt();
                counter = counter + 1;
            }
            System.out.println("Total score is " + Score);

        }


    }



