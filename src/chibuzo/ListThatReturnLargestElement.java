package chibuzo;

import java.util.List;

public class ListThatReturnLargestElement {
    public static void main(String[] args) {

    }
    public static int findLargest(List<Integer> list) {
        int largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            int current = list.get(i);
            if (current > largest) {
                largest = current;
            }
        }
        return largest;
    }
}
