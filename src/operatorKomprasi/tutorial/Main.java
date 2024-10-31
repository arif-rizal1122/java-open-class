package operatorKomprasi.tutorial;

public class Main {
    public static void main(String[] args) {
      // operasi komperasi menghasilkan nilai dalam bentuk boolean


       // true
       int a,b;
       boolean hasilKomparasi;
       a = 10;
       b = 10;
       hasilKomparasi = (a == b);
       System.out.printf("%d apakah sama dengan nilai %d ? %s\n",a,b, hasilKomparasi); // hasilnya true

        // fals
        int c,d;
        boolean hasilKomparasiku;
        c = 11;
        d = 10;
        hasilKomparasiku = (c == d);
        System.out.printf("%d apakah sama dengan nilai %d ? %s\n",a,b, hasilKomparasiku); // hasilnya fals

        // float
        float e,f;
        boolean hasilKomparasikuss;
        e = 10.0f;
        f = 10.0f;
        hasilKomparasikuss = (e == f);
        System.out.printf("%f apakah sama dengan nilai %f ? %s\n",e,f, hasilKomparasikuss); // hasilnya true

        // operator equal atau persamaan
        int  g,h;
        boolean hasilKom;
        g = 10;
        h = 10;
        hasilKom = (a == b);
        System.out.printf("%d == %d --> %s \n",g,h, hasilKom); // hasilnya 10 == 10 --> true

        // operator not equal atau pertidaksamaan
        int  i,j;
        boolean hasil;
        i = 10;
        j = 11;
        hasil = (i != j);
        System.out.printf("%d != %d --> %s \n",i,j, hasil); // hasilnya 10 = 11 --> true

        // operator less than atau kurang dari
        int  k,l;
        boolean hasilnya;
        k = 5;
        l = 11;
        hasilnya = (k < l);
        System.out.printf("%d < %d --> %s \n",k,l, hasilnya); // hasilnya 5 < 11 --> true

        // operator greater than atau lebih dari
        int  m,n;
        boolean resul;
        m = 5;
        n = 11;
        resul = (m > n);
        System.out.printf("%d < %d --> %s \n",m,n, resul); // hasilnya 5 > 11 --> false

        // operator less than equal atau kurang dari
        int  o,p;
        boolean result1;
        o = 5;
        p = 5;
        result1 = (o <= p);
        System.out.printf("%d <= %d --> %s \n",o,p, result1); // hasilnya 5 <= 11 --> true

        // operator greater than equal atau lebih dari
        int  q,r;
        boolean result2;
        q = 5;
        r = 6;
        result2 = (q >= r);
        System.out.printf("%d >= %d --> %s \n",q,r, result2); // hasilnya 5 => 11 --> false
    }
}
