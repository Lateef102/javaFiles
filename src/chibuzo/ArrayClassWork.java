package chibuzo;

import java.util.Arrays;

public class ArrayClassWork {
    public static void main(String[] args) {
        int[][] arr = new int[5][];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[10];

        arr[3] = new int[] {400, 500};
        arr[4] = new int[100];

        int duplicate = 2;

        for (int index = 0; index < arr[4].length; index++){
            arr[4][1] = index++;


            if (index == 0) {
                arr[4][index] += 100;
            }



            if (index > 0){
                arr[4][index] = 100 * duplicate;
                duplicate++;
            }
        }

        System.out.println(Arrays.deepToString(arr));
    }

}
