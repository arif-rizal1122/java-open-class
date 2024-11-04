package minMaxPadaArray.latihan;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
          Integer [] a = {0,1,2,3,4,5,6,7,8,9};
          int max  = Collections.max(Arrays.asList(a));
          int min  = Collections.min(Arrays.asList(a));

          System.out.print("deret angka : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
          System.out.println("");
          System.out.println(max);
          System.out.println(min);
    }
}
