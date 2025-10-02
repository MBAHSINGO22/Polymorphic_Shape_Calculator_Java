package Modul_9;

class SegiEmpat extends BangunDatar {
    // Atribut untuk menyimpan panjang dan lebar segi empat
    private double panjang;
    private double lebar;
    
    // Konstruktor untuk menginisialisasi panjang dan lebar segi empat
    public SegiEmpat(double panjang, double lebar) {
        this.panjang = panjang; // Mengatur nilai panjang
        this.lebar = lebar; // Mengatur nilai lebar
    }
    
    // Metode untuk menghitung keliling segi empat
    double hitungKeliling() {
        return 2 * (panjang + lebar); // Mengembalikan keliling segi empat
    }
    
    // Metode untuk menghitung luas segi empat
    double hitungLuas() {
        return panjang * lebar; // Mengembalikan luas segi empat
    }
}
