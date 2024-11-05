package prosedurFunc.latihan;

public class Main {

    // prosedur
    public static void siswa() {
        System.out.println("halo semua : ");
        System.out.println("selamat pagi : ");

        String nama = "otong";
        int umur = 17;
        System.out.println(": " + nama + " " + umur);
    }

    // fungsi
    public static String siswi() {
        String name = "bangke";
        int umur = 95;
        return ": " + name +" - "+ umur;
    }

    public static void main(String[] args) {
        /**
         * apa itu prosedur dan fungsi
         *
         * - PROSEDUR
         *
         * Prosedur adalah sub program yg tidak memiliki nilai kembalian sehingga tidak bisa lagi diolah di main program
         *
         * - FUNGSI
         * Fungsi adalah sub program yg memiliki nilai kembalian sehingga bisa kembali diolah di main program
         *
         *
         *
         * */

//        PROSEDUR
        siswa();
//        System.out.println(siswa()); tidak memiliki nilai kembalian


//        FUNCTION
        siswi();
        System.out.println(siswi());




    }
}
