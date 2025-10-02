package Modul_9;

class Segitiga extends BangunDatar {
    // Atribut untuk menyimpan panjang tiga sisi segitiga
    private double sisi1;
    private double sisi2;
    private double sisi3;
    
    // Konstruktor untuk menginisialisasi panjang tiga sisi segitiga
    public Segitiga(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1; // Mengatur nilai sisi1
        this.sisi2 = sisi2; // Mengatur nilai sisi2
        this.sisi3 = sisi3; // Mengatur nilai sisi3
    }
    
    // Metode untuk menghitung keliling segitiga
    double hitungKeliling() {
        return sisi1 + sisi2 + sisi3; // Mengembalikan keliling segitiga
    }
    
    // Metode untuk menghitung luas segitiga
    double hitungLuas() {
        // Menghitung rata-rata panjang sisi (s)
        double s = (sisi1 + sisi2 + sisi3) / 2;
        // Menghitung luas segitiga 
        return Math.sqrt(s * (s - sisi1) * (s - sisi2) * (s - sisi3)); // Mengembalikan luas segitiga
    }
}




