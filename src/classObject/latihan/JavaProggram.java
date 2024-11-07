package classObject.latihan;


import ISI.Deklarasi;

class Bahan {
    int x = 5;
}

public class JavaProggram {
    public static void main(String[] args) {
        Bahan obj = new Bahan();
        Kebutuhan objKebutuhan = new Kebutuhan();
        Deklarasi objDeklarasi = new Deklarasi();

        System.out.println("==========================================");
        System.out.println(obj.x + 10);
        System.out.println("==========================================");
        System.out.println(objKebutuhan.nama + " " + objKebutuhan.umur);
        System.out.println("==========================================");
        System.out.println(objDeklarasi.ttl);

    }
}


