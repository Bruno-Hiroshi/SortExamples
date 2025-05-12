import java.util.Arrays;

import Controller.Merge;

public class Main {
    public static void main(String[] args) throws Exception {
        int L[] = {15,2,13,14,15,18,1,2,6,4,11,9,8,4,5};
        Merge m = new Merge();

        m.Mergesort(L, 0, L.length - 1);
        System.out.println(Arrays.toString((L)));
    }
}
