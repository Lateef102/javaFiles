package chibuzo;

import java.util.Scanner;

public class TwelveDayOfXmas{
    static Scanner slang1 = new Scanner(System.in);

    public static void main(String[] args) {

        int input = 0;
       int userInput = slang1.nextInt();

       switch (input) {
           case 12:
               System.out.println("On the twelfth day of Christmas, my true love sent to me");
               break;
           case 11:
               System.out.println("On the eleventh day of Christmas, my true love sent to me");
               break;
           case 10:
               System.out.println("On the tenth day of Christmas, my true love sent to me");
               break;
           case 9:
               System.out.println("On the nine day of Christmas, my true love sent to me");
           case 8:
               System.out.println("On the eighth day of Christmas, my true love sent to me");
               break;
           case 7:
               System.out.println("On the seventh day of Christmas, my true love sent to me");
               break;
           case 6:
               System.out.println("On the sixth day of Christmas, my true love sent to me");
               break;
           case 5:
               System.out.println("On the fifth day of Christmas, my true love sent to me)");
               break;
           case 4:
               System.out.println("On the forth day of Christmas, my true love sent to me");
               break;
           case 3:
               System.out.println("On the three day of Christmas, my true love sent to me");
               break;
           case 2:
               System.out.println("On the two day of Christmas, my true love sent to me");
               break;
           case 1:
               System.out.println("On the one day of Christmas, my true love sent to me");
               break;
       }

               if (input >= 1 && input <= 12){

//                   int slang1 = 0;
             //      int  = slang1.nextInt();

                   switch (input) {


                       case 12:
                           System.out.println("Twelve drummers drumming");

                       case 11:
                           System.out.println("Eleven pipers piping");

                       case 10:
                           System.out.println("Ten lords a-leaping");

                       case 9:
                           System.out.println("Nine ladies dancing");
                       case 8:
                           System.out.println("Eight maids a-milking");

                       case 7:
                           System.out.println("Seven swans a-swimming");

                       case 6:
                           System.out.println("Six geese a-laying");

                       case 5:
                           System.out.println("Five gold rings (five golden rings)");

                       case 4:
                           System.out.println("Four calling birds");

                       case 3:
                           System.out.println("Three French hens");

                       case 2:
                           System.out.println("Two turtledoves");

                       case 1:
                           System.out.println("And a partridge in a pear tree");
                       default:
                           System.out.println("invalid");


                   }


               }
       }

        }
