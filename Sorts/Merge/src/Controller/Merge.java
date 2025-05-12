package Controller;

public class Merge {
       public void Mergesort(int[] L, int start,int end){
            
        if (start < end){
            int half = (start + end) / 2 ;
            Mergesort(L,start, half);
            Mergesort(L,half + 1, end);

            together(L, start, half, end);
        }
       }
public static void together(int[] L, int start, int half, int end){
    int l1 = half - start + 1;
    int l2 = end - half;

    int[] left = new int[l1];
    int[] right = new int[l2];

    for (int i = 0; i < l1; ++i){
        left[i] = L[start + i];
    }
    for (int j = 0; j < l2; ++j){
        right[j] = L[half + 1 + j];
    }
       
    int i =0, j = 0, k = start;
    
    while(i < l1 && j < l2){
        if(left[i] <= right[j]){
           L[k] = left[i];
           i++; 
        } else {
            L[k] = right[j];
            j++;
        }
        k++;
    }
    while (i < l1) {
            L[k] = left[i];
            i++;
            k++;
}       
    while (j < l2) {
            L[k] = right[j];
            j++;
            k++;
}

    
}
}
