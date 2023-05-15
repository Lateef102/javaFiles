package chibuzo;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SentinelClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalSales = 0;
        int counter = 0;
        while (counter < 5) {
            System.out.println("Enter sales for product" + counter);
            totalSales += input.nextInt();
            counter = counter + 1;
        }
        System.out.println("Total sales is " + totalSales);
    }

}