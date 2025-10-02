package Modul_9;

import java.util.Scanner;

public class MainBangunDatar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Minta pengguna untuk memasukkan jumlah bangun datar
        System.out.print("Masukkan jumlah bangun datar: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 
        
        // Membuat array untuk menyimpan objek bangun datar
        BangunDatar[] bangunDatarArray = new BangunDatar[n];
        
        // Menerima input data bangun datar dari pengguna
        for (int i = 0; i < n; i++) {
            System.out.println("Data bangun datar ke-" + (i + 1) + ":");
            bangunDatarArray[i] = inputBangunDatar(scanner);
        }
        
        // Menampilkan hasil keliling dan luas bangun datar
        System.out.println("=================================================");
        System.out.println("No. Bangun datar Keliling Luas");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < n; i++) {
            double keliling = bangunDatarArray[i].hitungKeliling();
            double luas = bangunDatarArray[i].hitungLuas();
            System.out.printf("%d. %s %.2f %.2f\n", (i + 1), bangunDatarArray[i].getClass().getSimpleName(), keliling, luas);
        }
        System.out.println("-------------------------------------------------");
    }
    
    // Fungsi untuk input data bangun datar
    public static BangunDatar inputBangunDatar(Scanner scanner) {
        // Minta pengguna untuk memilih jenis bangun datar
        System.out.print("Jenis bangun datar (SegiEmpat/Segitiga/Lingkaran): ");
        String jenis = scanner.nextLine().toLowerCase();
        
        // Menentukan jenis bangun datar berdasarkan input pengguna
        switch (jenis) {
            case "segiempat":
                // Minta pengguna untuk memasukkan panjang dan lebar
                System.out.print("Masukkan panjang: ");
                double panjang = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.print("Masukkan lebar: ");
                double lebar = scanner.nextDouble();
                scanner.nextLine(); 
                // Mengembalikan objek SegiEmpat
                return new SegiEmpat(panjang, lebar);
            case "segitiga":
                // Minta pengguna untuk memasukkan panjang tiga sisi
                System.out.print("Masukkan panjang sisi 1: ");
                double sisi1 = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.print("Masukkan panjang sisi 2: ");
                double sisi2 = scanner.nextDouble();
                scanner.nextLine(); 
                System.out.print("Masukkan panjang sisi 3: ");
                double sisi3 = scanner.nextDouble();
                scanner.nextLine(); 
                // Mengembalikan objek Segitiga
                return new Segitiga(sisi1, sisi2, sisi3);
            case "lingkaran":
                // Minta pengguna untuk memasukkan jari-jari
                System.out.print("Masukkan jari-jari: ");
                double jariJari = scanner.nextDouble();
                scanner.nextLine(); 
                // Mengembalikan objek Lingkaran
                return new Lingkaran(jariJari);
            default:
                // Jika input tidak valid, menampilkan pesan error dan mengembalikan null
                System.out.println("Jenis bangun datar tidak valid.");
                return null;
        }
    }
}
