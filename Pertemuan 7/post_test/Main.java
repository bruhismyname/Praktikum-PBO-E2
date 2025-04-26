/*  Nama File   : Main.java
 *  Deskripsi   : Kelas main untuk menjalankan program.
 *  Pembuat     : Rajwaa Muflihul Aufaa
 *  NIM         : 24060123140189
 *  Tanggal     : 24 April 2025
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}

/*
* Jawaban Post Test:
* 1. Hasil Output:
*    Program akan mencetak data untuk setiap pegawai (Mira, Joko, Argo).
*    Output spesifik dari metode tampilData() bergantung pada implementasi
*    di kelas Programmer dan Manajer. Secara umum, outputnya akan seperti ini:
*    
*    Nama    : Mira, Gaji pokok : 5000000
*    Bonus   : 450000
*    
*    Nama    : Joko, Gaji pokok : 5000000
*    Tunjangan : 700000
*    
*    Nama    : Argo, Gaji pokok : 5000000
*    Tunjangan : 700000
*
* 2. Manfaat Polimorfisme:
*    - Memungkinkan objek dari kelas turunan (seperti Programmer dan Manajer)
*      diperlakukan sebagai objek dari kelas induk (Pegawai).
*    - Dalam loop `for (Pegawai emp : emps)`, kita dapat memanggil metode
*      `tampilData()` pada setiap objek `emp` tanpa perlu mengetahui tipe
*      spesifiknya (apakah Programmer atau Manajer). Java secara otomatis
*      akan memanggil implementasi `tampilData()` yang sesuai dengan tipe
*      objek sebenarnya saat runtime (dynamic binding).
*    - Membuat kode lebih fleksibel dan mudah dikembangkan. Jika di masa
*      depan ada jenis Pegawai baru (misalnya, Designer), kita hanya perlu
*      membuat kelas baru yang mewarisi Pegawai dan mengimplementasikan
*      metode `tampilData()`, tanpa perlu mengubah kode di loop `main`.
*
* 3. Masalah Tanpa Polimorfisme (Inclusion) saat Menambah pegawai4 dan pegawai5:
*    - Tidak dapat menyimpan objek dari tipe yang berbeda (misalnya,
*      Programmer dan Manajer baru) dalam satu collection generik seperti
*      `ArrayList<Pegawai>`.
*    - Harus membuat collection terpisah untuk setiap tipe Pegawai
*      (misalnya, `ArrayList<Programmer>` dan `ArrayList<Manajer>`).
*    - Untuk memproses semua pegawai (termasuk pegawai4 dan pegawai5),
*      diperlukan loop terpisah untuk setiap tipe collection atau menggunakan
*      banyak pernyataan `if-else` atau `instanceof` untuk memeriksa tipe
*      setiap objek sebelum memanggil metode yang sesuai (misalnya,
*      `tampilDataProgrammer()` atau `tampilDataManager()`).
*    - Kode menjadi lebih rumit, sulit dibaca, dan sulit dikelola, terutama
*      jika ada banyak tipe Pegawai. Penambahan tipe Pegawai baru akan
*      membutuhkan perubahan signifikan pada kode pemrosesan di `main`.
*/