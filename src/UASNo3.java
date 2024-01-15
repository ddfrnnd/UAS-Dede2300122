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
        int totalPensil = 20000;
        int[] jumlahProduksi = new int[6];
        int maxProduksi = 0;
        int minProduksi = totalPensil;
        Pensil[] pensil = new Pensil[6];

        for (int i = 0; i < 6; i++) {
            pensil[i] = new Pensil("warna" + i);
            jumlahProduksi[i] = random.nextInt(totalPensil / 2) + totalPensil / 4;
            maxProduksi = Math.max(maxProduksi, jumlahProduksi[i]);
            minProduksi = Math.min(minProduksi, jumlahProduksi[i]);
            System.out.println("Jumlah produksi " + pensil[i].warna + " : " + jumlahProduksi[i]);
        }

        System.out.println("Jumlah produksi maksimum : " + maxProduksi);
        System.out.println("Jumlah produksi minimum : " + minProduksi);
    }
}
