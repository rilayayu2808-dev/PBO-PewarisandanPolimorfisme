//Subclass Silinder turunan dari kelas Lingkaran.
public class Silinder extends Lingkaran {
    private double tinggi;

    public Silinder(double t, double r, String w) {
        super(r, w); // Meneruskan parameter radius dan warna ke Lingkaran
        this.tinggi = t;
    }

    public double getTinggi() {
        return this.tinggi;
    }

    public void setTinggi(double t) {
        this.tinggi = t;
    }

    public double hitungVolume() {
        // Perhitungan volume: Luas Alas x Tinggi
        double luasAlas = hitungLuas();
        return luasAlas * this.tinggi;
    }

    @Override
    public void printInfo() {
        System.out.printf("Silinder warna %s, volume = %.1f\n", getWarna(), hitungVolume());
    }
}