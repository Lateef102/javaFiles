package chibuzo;

import java.util.Arrays;

public class ArraySample7 {

        public static void main(String[] args) {
            int[][] arr = new int[5][];
            arr[0] = new int[5];
            arr[1] = new int[3];
            arr[2] = new int[10];
            arr[3] = new int[] {400, 500};

            for (int index = 0; index < arr[0].length; index++){
                arr[0][index] = index;
            }
            System.out.println(Arrays.deepToString(arr));
        }
}


