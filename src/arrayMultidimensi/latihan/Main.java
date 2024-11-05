package arrayMultidimensi.latihan;

public class Main {
    public static void main(String[] args) {
        // deklarasi array multidimensi
//       String[][] buah  =  new String[2][2];
//       buah [0][0] = "mangga";
//       buah [0][1] = "kedongong";
//       buah [1][0] = "salak";
//       buah [1][1] = "jambu";
//        System.out.println(buah[0][0]);
//        System.out.println(buah[1][0]);
//        System.out.println(buah[0][1]);
//        System.out.println(buah[1][1]);

        String[][] buah = {
                {"mangga", "\t (leci)"},
                {"sirsak", "\t (mente)"}
        };
        /**
         * mangga
         * sirsak
         * leci
         * mente
         *
         * */

        System.out.print(buah[0][0]);
        System.out.println(buah[0][1]);
        System.out.print(buah[1][0]);
        System.out.println(buah[1][1]);

        System.out.print("_____________________________________________________________");
        System.out.println(buah.length); // lenght nya tetap dua
    }
}
