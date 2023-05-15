package chibuzo;

 class GetMinimum {
     private int num1;
     private int num2;
     private int num3;

     public static int maximum(int num1, int num2, int num3){
         return Math.max(num1, Math.max( num2, num3));
     }

     public static void main(String[] args) {
         int Max = maximum( 9, 6, 5);
         System.out.println("The maximum number is " + Max);

         int min = minimum(9, 7, 2);
         System.out.println("The lesser number is " + min);

     }

     public static int minimum( int num1, int num2, int num3){
         return Math.min(num1, Math.min(num2, num3));
       }





 }