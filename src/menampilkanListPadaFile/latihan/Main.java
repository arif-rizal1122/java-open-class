package menampilkanListPadaFile.latihan;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        String homeDir = System.getProperty("user.home");
        String dir = homeDir + "/Desktop/step_1";
        File f = new File(dir);
        String[] daftar = f.list();

        for (int i = 0; i < daftar.length; i++) {
            File fTemp = new File(homeDir+"/"+daftar[i]);
            if (fTemp.isDirectory()) {
                System.out.println(daftar[i]+"\t\t<dir>");
            } else {
                System.out.println(daftar[i]);
            }
        }
    }

}
