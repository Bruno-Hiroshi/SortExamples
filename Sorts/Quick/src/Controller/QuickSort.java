package Controller;

public class QuickSort{

public void Quicksort(int[] v, int start, int end){
        var pivo = v[start];
        int c = start;
        int f = end;

        while (c <= f)
        {

            while(v[c] < pivo) c++;
            while(v[f] > pivo) f--;

            if (c <= f)
            {
                int aux;
                aux = v[f];
                v[f] = v[c];
                v[c] = aux;
                c++;
                f--;
            }
        }

        if (start < f) Quicksort(v, start, f);
        if (c < end) Quicksort(v,c, end);

        
}
 
}
