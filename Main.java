public class Main {
    public static void main(String[] args) {
        // Inisialisasi array bertipe Bentuk tanpa deklarasi 'new Bentuk[]' (menghilangkan warning kuning)
        Bentuk[] objekBentuk = {
            new Bentuk("Merah"),
            new BujurSangkar(5.0, "Biru"),
            new Lingkaran(7.0, "Hijau"),
            new Silinder(10.0, 7.0, "Kuning")
        };

        // Perulangan for-each (lebih bersih dan tidak memicu warning IDE)
        for (Bentuk b : objekBentuk) {
            b.printInfo();
        }
    }
}