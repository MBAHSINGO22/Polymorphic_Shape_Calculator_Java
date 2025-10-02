
# 🧮 Polymorphic Shape Calculator Java

Demonstrasi Polimorfisme dan Abstraksi untuk Perhitungan Bangun Datar di Java.

## 📖 Deskripsi Proyek

Proyek Java yang mendemonstrasikan penggunaan **kelas abstrak** dan **polimorfisme** untuk mengelola perhitungan keliling dan luas bangun datar. Program ini memungkinkan pengguna memasukkan data bangun datar secara dinamis melalui konsol, menyimpan objek dalam array, dan menampilkan hasil perhitungan.

Proyek ini berfokus pada:

- 📊 **BangunDatar.java**: Kelas abstrak induk yang mendefinisikan metode abstrak `hitungKeliling()` dan `hitungLuas()`.
- 🔍 **SegiEmpat.java**: Menghitung keliling `2 × (panjang + lebar)` dan luas `panjang × lebar`.
- 🔍 **Segitiga.java**: Menghitung keliling `(sisi1 + sisi2 + sisi3)` dan luas menggunakan **rumus Heron**.
- 🔍 **Lingkaran.java**: Menghitung keliling `2 × π × r` dan luas `π × r²`.
- 🛠️ **MainBangunDatar.java**: Kelas utama yang menerima input jumlah dan jenis bangun datar lalu menghitung keliling dan luas secara polimorfik.

---

## 🧠 Teknologi

- Java ☕

---

## 📂 Struktur File

```
Polymorphic_Shape_Calculator_Java/
├── src/Modul_9/
├── MainBangunDatar.java    # 🛠️ Kelas utama
├── BangunDatar.java        # 📊 Kelas abstrak induk
├── SegiEmpat.java          # 🔍 Kelas turunan untuk segiempat
├── Segitiga.java           # 🔍 Kelas turunan untuk segitiga
├── Lingkaran.java          # 🔍 Kelas turunan untuk lingkaran
```

---

## 🟢 Catatan

- Program menerima input jumlah bangun datar, jenis (SegiEmpat, Segitiga, Lingkaran), dan parameter (panjang, lebar, sisi, jari-jari) melalui konsol.
- Polimorfisme diterapkan melalui array `BangunDatar[]` yang menyimpan berbagai objek turunan.
- `BangunDatar` bersifat abstrak dan tidak dapat diinstansiasi langsung.
- Gunakan `java.util.Scanner` untuk input dan `java.lang.Math` untuk perhitungan.

---

## 📈 Contoh Output

```
Masukkan jumlah bangun datar: 3
Data bangun datar ke-1:
Jenis bangun datar (SegiEmpat/Segitiga/Lingkaran): SEGIEMPAT
Masukkan panjang: 20
Masukkan lebar: 29
Data bangun datar ke-2:
Jenis bangun datar (SegiEmpat/Segitiga/Lingkaran): SEGITIGA
Masukkan panjang sisi 1: 23
Masukkan panjang sisi 2: 11
Masukkan panjang sisi 3: 14
Data bangun datar ke-3:
Jenis bangun datar (SegiEmpat/Segitiga/Lingkaran): LINGKARAN
Masukkan jari-jari: 6

=================================================
No.   Bangun Datar   Keliling     Luas
-------------------------------------------------
1.    SegiEmpat       98.00       580.00
2.    Segitiga        48.00        55.86
3.    Lingkaran       37.70       113.10
-------------------------------------------------
```

---

## 👨‍💻 Pengembang

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)
