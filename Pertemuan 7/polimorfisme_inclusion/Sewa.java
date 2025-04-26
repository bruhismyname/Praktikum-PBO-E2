/*  Nama File   : Sewa.java
 *  Deskripsi   : Kelas sewa digunakan untuk menghitung biaya sewa kendaraan melalui metode utilitas bernama hitungSewa().
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

public class Sewa {
  // metode utilitas yang hanya tahu tipe Vehicle
  static void hitungSewa(Vehicle v, int jarak, float hargaPerKm) {
    v.calRent(jarak, hargaPerKm);
  }

  public static void main(String[] args) {
    Vehicle kendaraan = new Vehicle();
    Vehicle mobil = new Car();
    Vehicle bis = new Bus();

    System.out.println("\n/******************* TANPA hitungSewa *******************/");
    kendaraan.calRent(50, 1000);
    mobil.calRent(50, 1000);
    bis.calRent(50, 1000);

    System.out.println("\n/******************* DENGAN hitungSewa *******************/");
    hitungSewa(kendaraan, 50, 1000);
    hitungSewa(mobil, 50, 1000);
    hitungSewa(bis, 50, 1000);
  }
}

/*
 * Analisis Keuntungan Penggunaan Teknik Polimorfisme Inclusion pada metode
 * hitungSewa(Vehicle v, int jarak, float hargaPerKm):
 *
 * 1. Generalitas dan Fleksibilitas:
 * Metode `hitungSewa` dapat menerima objek dari kelas `Vehicle` maupun
 * *semua* subclass-nya (seperti `Car`, `Bus`, atau kelas turunan `Vehicle`
 * lainnya yang mungkin dibuat di masa depan) tanpa perlu mengubah kode
 * metode `hitungSewa`. Hal ini dimungkinkan karena objek subclass dapat
 * diperlakukan sebagai objek superclass (prinsip upcasting).
 *
 * 2. Kode Lebih Sederhana dan Mudah Dipelihara:
 * Tidak perlu membuat metode terpisah untuk setiap jenis kendaraan
 * (misalnya, `hitungSewaMobil`, `hitungSewaBus`). Cukup satu metode
 * `hitungSewa` yang dapat digunakan untuk semua jenis `Vehicle`. Ini
 * mengurangi duplikasi kode dan mempermudah pemeliharaan. Jika ada perubahan
 * pada logika perhitungan sewa yang bersifat umum, cukup dilakukan di satu
 * tempat saja.
 *
 * 3. Kemudahan Pengembangan:
 * Jika di masa depan ditambahkan kelas baru yang merupakan turunan dari
 * `Vehicle` (misalnya, `Truck`), metode `hitungSewa` dapat langsung
 * digunakan untuk objek `Truck` tanpa perlu modifikasi, selama kelas
 * `Truck` mengimplementasikan metode `calRent` (atau menggunakan
 * implementasi default dari `Vehicle` jika tidak di-override). Hal ini
 * membuat sistem lebih mudah untuk dikembangkan.
 *
 * Secara keseluruhan, polimorfisme inclusion memungkinkan penulisan kode
 * yang lebih generik, fleksibel, dan mudah dikembangkan untuk menangani
 * berbagai objek yang memiliki hubungan inheritance. Metode `hitungSewa`
 * menjadi lebih reusable dan adaptif terhadap penambahan jenis `Vehicle`
 * baru.
 */