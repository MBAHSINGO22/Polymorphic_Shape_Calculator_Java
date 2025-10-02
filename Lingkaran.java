package Modul_9;

class Lingkaran extends BangunDatar {
    // Atribut untuk menyimpan panjang jari-jari lingkaran
    private double jariJari;
    
    // Konstruktor untuk menginisialisasi panjang jari-jari lingkaran
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari; // Mengatur nilai jariJari
    }
    
    // Metode untuk menghitung keliling lingkaran
    double hitungKeliling() {
        return 2 * Math.PI * jariJari; // Mengembalikan keliling lingkaran
    }
    
    // Metode untuk menghitung luas lingkaran
    double hitungLuas() {
        return Math.PI * Math.pow(jariJari, 2); // Mengembalikan luas lingkaran
    }
}








