package chibuzo;

import java.util.Scanner;

public class EbukaOmoIbo {
     public static void main(String[] args) {
        Ebuka ebuka1 = new Ebuka("Charles", 60, 6.1, "color" );

        ebuka1.setName("Charles");
         System.out.println(ebuka1.getName());

         ebuka1.setAge(60);
         System.out.println(ebuka1.getAge());

         ebuka1.setHeight(6.1);
         System.out.println(ebuka1.getHeight());

         ebuka1.setColor("black");
         System.out.println(ebuka1.getColor());


     }



}

