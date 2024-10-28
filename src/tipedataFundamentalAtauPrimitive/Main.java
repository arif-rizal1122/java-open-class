package tipedataFundamentalAtauPrimitive;

public class Main {
    public static void main(String[] args) {
        // tipe data di java
        // int, byte, short, long, double, float, char, boolean

        // integer (satuan)
        int i = 10;
        System.out.println("=========INTEGER========");
        System.out.println("nilai int = " + i);
        System.out.println("nilai max = " + Integer.MAX_VALUE);
        System.out.println("nilai min = " + Integer.MIN_VALUE);
        System.out.println("besar int = " + Integer.BYTES + " Bytes");
        System.out.println("besar int = " + Integer.SIZE + " bit");

        // byte (satuan)
        byte b = 10;
        System.out.println("\n=========BYTE========");
        System.out.println("nilai byte = " + b);
        System.out.println("nilai max = " + Byte.MAX_VALUE);
        System.out.println("nilai min = " + Byte.MIN_VALUE);
        System.out.println("besar byte = " + Byte.BYTES + " Bytes");
        System.out.println("besar byte = " + Byte.SIZE + " bit");

        // short
        short s = 10;
        System.out.println("\n=========SHORT========");
        System.out.println("nilai short = " + s);
        System.out.println("nilai max = " + Short.MAX_VALUE);
        System.out.println("nilai min = " + Short.MIN_VALUE);
        System.out.println("besar short = " + Short.BYTES + " Bytes");
        System.out.println("besar short = " + Short.SIZE + " bit");

        // long
        long l = 10L; // Tambahkan L untuk literal long
        System.out.println("\n=========LONG========");
        System.out.println("nilai long = " + l);
        System.out.println("nilai max = " + Long.MAX_VALUE);
        System.out.println("nilai min = " + Long.MIN_VALUE);
        System.out.println("besar long = " + Long.BYTES + " Bytes");
        System.out.println("besar long = " + Long.SIZE + " bit");

        // double (bilangan desimal)
        double d = 10.5d; // d opsional
        System.out.println("\n=========DOUBLE========");
        System.out.println("nilai double = " + d);
        System.out.println("nilai max = " + Double.MAX_VALUE);
        System.out.println("nilai min = " + Double.MIN_VALUE);
        System.out.println("besar double = " + Double.BYTES + " Bytes");
        System.out.println("besar double = " + Double.SIZE + " bit");

        // float (bilangan desimal)
        float f = 10.5f; // f wajib untuk float
        System.out.println("\n=========FLOAT========");
        System.out.println("nilai float = " + f);
        System.out.println("nilai max = " + Float.MAX_VALUE);
        System.out.println("nilai min = " + Float.MIN_VALUE);
        System.out.println("besar float = " + Float.BYTES + " Bytes");
        System.out.println("besar float = " + Float.SIZE + " bit");

        // char (karakter)
        char c = 'A';
        System.out.println("\n=========CHAR========");
        System.out.println("nilai char = " + c);
        System.out.println("nilai max = " + (int) Character.MAX_VALUE);
        System.out.println("nilai min = " + (int) Character.MIN_VALUE);
        System.out.println("besar char = " + Character.BYTES + " Bytes");
        System.out.println("besar char = " + Character.SIZE + " bit");

        // boolean (nilai true atau false)
        boolean bool = true;
        System.out.println("\n=========BOOLEAN========");
        System.out.println("nilai boolean = " + bool);
        // boolean tidak memiliki MAX_VALUE dan MIN_VALUE
        // ukuran boolean bervariasi tergantung implementasi JVM
    }
}