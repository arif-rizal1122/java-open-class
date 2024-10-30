package converseTipeDataNumeric.tutorial;

public class Main {
    public static void main(String[] args) {
      // converse tipe data numeric

      int nilaiInt = 450; // 32-bit
      System.out.println("nilai int = " + nilaiInt);
      // memperluas rentang ke tipe data yg lebih besar
      long nilaiLong = nilaiInt;
      System.out.println("nilai long = " + nilaiLong);
      /**
       * konversi dari tipe data dari yg kecil ke yg besar itu tidak akan
       * */

      // memperkecil rentang ke tipe data yang lebih keci akan menghilangkan nilai aslinya
        /**
         * java: incompatible types: possible lossy conversion from int to byte
         * byte nilaiByte = nilaiInt;
         * */
       byte nilaiByte = (byte) nilaiInt;
        System.out.println("nilai byte " + nilaiByte); // -62
        System.out.println("nilai max byte " + Byte.MAX_VALUE);
        System.out.println("nilai min byte " + Byte.MIN_VALUE);

        // casting pembagian
        float a = 10;
        int b = 4;

        // Mengonversi salah satu operand menjadi float
        float c = a/b; // atau float c = a / (float) b;
        System.out.printf("%f / %d = %f\n", a, b, c);

        int x = 10;
        int y = 4;

        // Pembagian dengan casting
        float z = (float) x / y;
        // Menggunakan printf untuk format output
        System.out.printf("%d / %d = %f\n", x, y, z);
    }
}
