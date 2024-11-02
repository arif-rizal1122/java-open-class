package ArraySatuDimensi.latihan;

public class Main {
    public static void main(String[] args) {
      /**
       * ARRAY | LARIK
       *
       * adalah sebuah variable yg diisi lebih dari satu value
       * int a = 1;
       * int a[3] = {index 0, index 1, index 3};
       *
       * Macam-macam array
       * * 1 dimensi
       * * multi dimensi
       * * array list
       *
       * */

      int a = 5;
      int [] b = {1,2,3,4};
      String[] buah = {"mangga", "jeruk", "apel"};
      // coba ubah
      buah[2] = "buah apelku";

      System.out.println("varibale biasa " + a);
      System.out.println("array index ke = " + b[1]);

      System.out.println("mencari index dari buah-buah index ke = " + buah[2]);
    }
}
