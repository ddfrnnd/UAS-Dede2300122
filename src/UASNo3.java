import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class Pensil {
    String warna;

    public Pensil(String warna) {
        this.warna = warna;
    }
}

public class UASNo3 {
    public static void main(String[] args) {
        Random random = new Random();
        int totalProduksi = 20000;
        ArrayList<Pensil> bluePensils = new ArrayList<Pensil>();
        ArrayList<Pensil> redPensils = new ArrayList<Pensil>();
        ArrayList<Pensil> greenPensils = new ArrayList<Pensil>();
        ArrayList<Pensil> orangePensils = new ArrayList<Pensil>();
        ArrayList<Pensil> blackPensils = new ArrayList<Pensil>();
        ArrayList<Pensil> purplePensils = new ArrayList<Pensil>();

        for (int i = 0; i < totalProduksi; i++) {
            int randomWarna = random.nextInt(6);
            switch (randomWarna) {
                case 0:
                    bluePensils.add(new Pensil("biru"));
                    break;
                case 1:
                    redPensils.add(new Pensil("merah"));
                    break;
                case 2:
                    greenPensils.add(new Pensil("hijau"));
                    break;
                case 3:
                    orangePensils.add(new Pensil("oranye"));
                    break;
                case 4:
                    blackPensils.add(new Pensil("hitam"));
                    break;
                case 5:
                    purplePensils.add(new Pensil("ungu"));
                    break;
            }
        }

        System.out.println("Total jumlah pensil dari setiap warna:");
        System.out.println("Biru: " + bluePensils.size());
        System.out.println("Merah: " + redPensils.size());
        System.out.println("Hijau: " + greenPensils.size());
        System.out.println("Oranye: " + orangePensils.size());
        System.out.println("Hitam: " + blackPensils.size());
        System.out.println("Ungu: " + purplePensils.size());

        int maxProduksi = 0;
        int minProduksi = Integer.MAX_VALUE;
        String maxWarna = "";
        String minWarna = "";

        for (ArrayList<Pensil> pensils : Arrays.asList(bluePensils, redPensils, greenPensils, orangePensils, blackPensils, purplePensils)) {
            int produksi = pensils.size();
            if (produksi > maxProduksi) {
                maxProduksi = produksi;
                maxWarna = pensils.get(0).warna;
            }
            if (produksi < minProduksi) {
                minProduksi = produksi;
                minWarna = pensils.get(0).warna;
            }
        }

        System.out.println("Jumlah produksi maksimum: " + maxProduksi + " (" + maxWarna + ")");
        System.out.println("Jumlah produksi minimum: " + minProduksi + " (" + minWarna + ")");
    }
}
