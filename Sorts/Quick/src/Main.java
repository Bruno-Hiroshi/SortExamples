import java.util.Arrays;

import Controller.QuickSort;
public class Main {
    public static void main(String[] args) throws Exception {
        int[] Vetor = {10, 3, 2, 5, 6, 7, 12, 11, 15, 16};
        QuickSort Q = new QuickSort();
        Q.Quicksort(Vetor, 0, Vetor.length -1);
        System.out.println(Arrays.toString(Vetor));
}
}