public class FizzBuzz {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 100) {
            if (count % 3 == 0) System.out.println("Fiss");
            else if (count % 5 == 0) System.out.println("buzz");
            else if ((count % 3 == 0) && (count % 5 == 0)) System.out.println("fissbuzz");
            else System.out.println(count);


            count++;

        }

    }
}




