package String.latihan;




public class Main {
    public static void main(String[] args) {
        String nama = "Arif Rizal";
        System.out.println(nama.length()); // 10. spasi termasuk carakter
        System.out.println(nama.toUpperCase()); // ARIF RIZAL
        System.out.println(nama.toLowerCase()); // arif rizal

        System.out.println("===========================================================");
        // mengambil charecter di dalam variabel string (disini chartAt bya tidak menghitung/ mengmbil spasi nya sebagai chart)
        System.out.println(nama.charAt(1));
        System.out.println(nama.charAt(9));

        System.out.println("===========================================================");
        // split array
        String kata[] = nama.split(" "); // di split berdasarkan spasi
        System.out.println("nama depan : " +kata[0].toUpperCase());     // mencari index ke nol nya (ARIF)
        System.out.println("nama belakang : " +kata[1].toLowerCase());
        System.out.println("jumlah per kata " + kata.length); // 2


        System.out.println("===========================================================");


    }
}
