//Subclass BujurSangkar turunan dari kelas Bentuk.

public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double ukuranSisi, String warnaBentuk) {
        super(warnaBentuk); // Memanggil constructor milik Bentuk
        this.sisi = ukuranSisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double nilaiSisi) {
        this.sisi = nilaiSisi;
    }

    public double hitungLuas() {
        // Menggunakan Math.pow untuk variasi kalkulasi kuadrat
        return Math.pow(this.sisi, 2);
    }

    @Override
    public void printInfo() {
        System.out.printf("Bujursangkar berwarna %s, luas = %.1f\n", getWarna(), hitungLuas());
    }
}