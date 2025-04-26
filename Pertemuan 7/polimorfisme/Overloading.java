/*  Nama File   : Overloading.java
 *  Deskripsi   : Penjelasan dan contoh Polimorfisme Ad Hoc (Overloading).
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

// Contoh Overloading pada Konstruktor dari BangunDatar.java
class ContohBangunDatar {
  protected int jmlSisi;
  protected String warna;
  protected String border;

  public ContohBangunDatar() {
    this.jmlSisi = 0;
    this.warna = "default";
    this.border = "default";
    System.out.println("Konstruktor BangunDatar tanpa parameter dipanggil.");
  }

  public ContohBangunDatar(int jmlSisi, String warna, String border) {
    this.jmlSisi = jmlSisi;
    this.warna = warna;
    this.border = border;
    System.out.println("Konstruktor BangunDatar dengan 3 parameter dipanggil.");
  }

  public ContohBangunDatar(int jmlSisi, String warna) {
    this(jmlSisi, warna, "solid"); 
    System.out.println("Konstruktor BangunDatar dengan 2 parameter dipanggil.");
  }
}

// Contoh Overloading Method Biasa
class Kalkulator {
  public int tambah(int a, int b) {
    System.out.println("Memanggil tambah(int, int)");
    return a + b;
  }

  public int tambah(int a, int b, int c) {
    System.out.println("Memanggil tambah(int, int, int)");
    return a + b + c;
  }

  public double tambah(double a, double b) {
    System.out.println("Memanggil tambah(double, double)");
    return a + b;
  }

  public double tambah(int a, double b) {
    System.out.println("Memanggil tambah(int, double)");
    return a + b;
  }

  public double tambah(double a, int b) {
    System.out.println("Memanggil tambah(double, int)");
    return a + b;
  }
}

public class Overloading {
  public static void main(String[] args) {
    System.out.println("--- Contoh Overloading Konstruktor ---");
    ContohBangunDatar bd1 = new ContohBangunDatar();
    ContohBangunDatar bd2 = new ContohBangunDatar(4, "Coklat", "Garis Putus");
    ContohBangunDatar bd3 = new ContohBangunDatar(3, "Hitam");

    System.out.println("Jumlah sisi bd1: " + bd1.jmlSisi + ", Warna: " + bd1.warna + ", Border: " + bd1.border);
    System.out.println("Jumlah sisi bd2: " + bd2.jmlSisi + ", Warna: " + bd2.warna + ", Border: " + bd2.border);
    System.out.println("Jumlah sisi bd3: " + bd3.jmlSisi + ", Warna: " + bd3.warna + ", Border: " + bd3.border);

    System.out.println("\n--- Contoh Overloading Method ---");
    Kalkulator calc = new Kalkulator();
    System.out.println("Hasil 5 + 10 = " + calc.tambah(5, 10));
    System.out.println("Hasil 5 + 10 + 15 = " + calc.tambah(5, 10, 15));
    System.out.println("Hasil 3.5 + 2.7 = " + calc.tambah(3.5, 2.7));
    System.out.println("Hasil 5 + 4.2 = " + calc.tambah(5, 4.2));
    System.out.println("Hasil 6.1 + 9 = " + calc.tambah(6.1, 9));
  }
}

// Contoh lain dari proyek sebelumnya:
// - Konstruktor Titik(double, double) dan Titik() di Praktikum 1 & Praktikum 2
// - Konstruktor Garis(Titik, Titik) dan Garis() di Praktikum 1 & Praktikum 2
// - Konstruktor Persegi(...) dan Lingkaran(...) di Praktium 4 & Praktikum 5
// - Method hitungTotalBiayaKebersihan(...) di Main.java Responsi UTS

/*
 * Penjelasan:
 * Polimorfisme Ad Hoc, yang lebih dikenal sebagai Method Overloading,
 * adalah kemampuan sebuah kelas untuk mendefinisikan beberapa method
 * dengan nama yang sama, tetapi memiliki parameter yang berbeda. Perbedaan
 * parameter ini dapat berupa:
 * 1. Jumlah parameter yang berbeda.
 * 2. Tipe data parameter yang berbeda.
 * 3. Urutan tipe data parameter yang berbeda (jika tipe datanya berbeda).
 *
 * Kompiler Java akan menentukan method mana yang akan dipanggil berdasarkan
 * argumen yang diberikan saat pemanggilan method pada waktu kompilasi (compile time).
 * Oleh karena itu, overloading sering disebut sebagai Polimorfisme Waktu Kompilasi
 * (Compile-time Polymorphism) atau Polimorfisme Statis (Static Polymorphism).
 *
 * Syarat-syarat Method Overloading:
 * 1. Nama Method Harus Sama: Semua method yang di-overload harus memiliki nama yang sama.
 * 2. Daftar Parameter Harus Berbeda: Perbedaan harus ada pada jumlah, tipe, atau urutan tipe parameter.
 * 3. Return Type Tidak Cukup: Perbedaan hanya pada return type tidak dianggap sebagai overloading.
 *    Method dengan nama dan parameter yang sama tetapi return type berbeda akan menyebabkan error saat kompilasi.
 * 4. Access Modifier Boleh Berbeda: Method yang di-overload boleh memiliki access modifier yang berbeda.
 * 5. Exception yang Dilempar Boleh Berbeda: Method yang di-overload boleh melempar exception yang berbeda.
 */